//
//  SclMasterViewController.m
//  SampleUseCouchbaselite2
//
//  Created by nakawaka shigeto on 2013/11/07.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import "SclMasterViewController.h"
#import "SclDetailViewController.h"
#import "SclAppDelegate.h"
#import "Memo.h"

@interface SclMasterViewController () {
    CBLDatabase* _database;
    CBLLiveQuery* _query;
}
@end

@implementation SclMasterViewController

- (void)awakeFromNib
{
    [super awakeFromNib];
}

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    self.navigationItem.leftBarButtonItem = self.editButtonItem;

    UIBarButtonItem *addButton = [[UIBarButtonItem alloc] initWithBarButtonSystemItem:UIBarButtonSystemItemAdd target:self action:@selector(insertNewObject:)];
    self.navigationItem.rightBarButtonItem = addButton;
    
    [self setEditing: NO];
    [self.tableView setEditing: YES animated: YES];
    _database = ((SclAppDelegate*)[[UIApplication sharedApplication] delegate]).database;
    
    [[_database modelFactory] registerClass: [Memo class] forDocumentType: @"memo"];
    NSAssert(_dataSource, @"_dataSource not connected");
    _query = [self queryMemoInDatabase: _database].asLiveQuery;
    _dataSource.query = _query;
    _dataSource.labelProperty = @"title";
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void)insertNewObject:(id)sender
{
    Memo* item = [[Memo alloc] initWithNewDocumentInDatabase: _database];
    item.title = @"no title";
    item.created_at = [NSDate date];
    NSError* error;
    BOOL ok = [item save: &error];
    if (ok) {
        NSLog(@"**** save ok!! %d", [_database documentCount]);
//        NSIndexPath *indexPath = [NSIndexPath indexPathForRow:0 inSection:0];
//        [self.tableView insertRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationAutomatic];
    }
}

#pragma mark - Table View

//- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath
//{
//    NSLog(@"===> can delete?");
//    // Return NO if you do not want the specified item to be editable.
//    return YES;
//}

//- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath
//{
//    if (editingStyle == UITableViewCellEditingStyleDelete) {
//        // TODO indexPath.row
//        [tableView deleteRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationFade];
//    } else if (editingStyle == UITableViewCellEditingStyleInsert) {
//        // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view.
//    }
//}

/*
// Override to support rearranging the table view.
- (void)tableView:(UITableView *)tableView moveRowAtIndexPath:(NSIndexPath *)fromIndexPath toIndexPath:(NSIndexPath *)toIndexPath
{
}
*/

/*
// Override to support conditional rearranging of the table view.
- (BOOL)tableView:(UITableView *)tableView canMoveRowAtIndexPath:(NSIndexPath *)indexPath
{
    // Return NO if you do not want the item to be re-orderable.
    return YES;
}
*/

- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender
{
    if ([[segue identifier] isEqualToString:@"showDetail"]) {
        NSIndexPath *indexPath = [self.tableView indexPathForSelectedRow];
        
        CBLQueryRow *row = [self.dataSource rowAtIndex:indexPath.row];
        Memo* memo = [Memo modelForDocument: row.document];
        [[segue destinationViewController] setDetailItem:memo];
    }
}

#pragma mark - couchbase lite delegate

// Delegate method called when the live-query results change.
- (void)couchTableSource:(CBLUITableSource*)source
         updateFromQuery:(CBLLiveQuery*)query
            previousRows:(NSArray *)previousRows
{
    [self.tableView reloadData];
}

- (UITableViewCell *) couchTableSource:(CBLUITableSource *)source
                 cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    UITableViewCell *cell = [self.tableView dequeueReusableCellWithIdentifier:@"Cell" forIndexPath:indexPath];
  
    CBLQueryRow *queryRow =  [source rowAtIndex:indexPath.row];
    Memo *memo = [Memo modelForDocument:queryRow.document];
 
    cell.textLabel.text = memo.title;
    {
        
        static NSDateFormatter *formatter = nil;
        if (formatter == nil){
            formatter = [[NSDateFormatter alloc] init];
            [formatter setDateFormat:@"yyyy-MM-dd(E) HH:mm:ss"];
        }
        
        NSString *s = [formatter stringFromDate:memo.created_at];
        cell.detailTextLabel.text = s;
    }
    
    return cell;
    
}

#pragma mark - couchbase lite
- (CBLQuery*) queryMemoInDatabase: (CBLDatabase*)db {
    CBLView* view = [db viewNamed: @"memoOrderByCreatesDate"];
    if (!view.mapBlock) {
        [view setMapBlock: MAPBLOCK({
            
            // NSLog(@"doc %@", doc);
            id date = doc[@"created_at"];
            emit(@[date], doc);
           
        }) reduceBlock: nil version: @"0"];
    }
    
    CBLQuery *query = [view query];
    query.descending = YES;
    return query;
}

@end
