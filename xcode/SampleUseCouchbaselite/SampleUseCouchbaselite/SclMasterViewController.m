//
//  SclMasterViewController.m
//  SampleUseCouchbaselite
//
//  Created by nakawaka shigeto on 2013/11/06.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import "SclMasterViewController.h"
#import "SclDetailViewController.h"
#import "SclAppDelegate.h"
#import "Memo.h"

@interface SclMasterViewController () {
    NSMutableArray *_objects;
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
    
    //
    _database = ((SclAppDelegate*)[[UIApplication sharedApplication] delegate]).database;
}

- (void) viewWillAppear:(BOOL)animated
{
    [super viewWillAppear:animated];
    // 再描画させる
    [self.tableView reloadData];
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
        NSIndexPath *indexPath = [NSIndexPath indexPathForRow:0 inSection:0];
        [self.tableView insertRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationAutomatic];
    }
}

#pragma mark - Table View

- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView
{
    return 1;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return [_database documentCount];
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:@"Cell" forIndexPath:indexPath];
    

    Memo *memo = [self getMemo:indexPath];

    cell.textLabel.text =[memo.title description];
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

- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath
{
    // Return NO if you do not want the specified item to be editable.
    return YES;
}

- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath
{
    if (editingStyle == UITableViewCellEditingStyleDelete) {
//        [_objects removeObjectAtIndex:indexPath.row];
//        [tableView deleteRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationFade];
        
        Memo *memo = [self getMemo:indexPath];

        NSError *error;
        if(![memo deleteDocument:&error]) {
            NSLog(@"ouch...");
            return;
        }
        [tableView deleteRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationFade];
    } else if (editingStyle == UITableViewCellEditingStyleInsert) {
        // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view.
    }
}

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
        
        Memo *memo = [self getMemo:indexPath];
        
        [[segue destinationViewController] setDetailItem:memo];
    }
}

#pragma mark - query
- (Memo*) getMemo:(NSIndexPath *)indexPath
{
    // CBLQuery *query = [_database queryAllDocuments];
    CBLQuery *query = [self query];
    query.descending = YES;
    CBLQueryRow *queryRow =  [[query rows] rowAtIndex:indexPath.row];
    Memo *memo = [Memo modelForDocument:queryRow.document];
    return memo;
}

- (CBLQuery*) query {
    CBLView* view = [_database viewNamed: @"memoByCDate"];
    if (!view.mapBlock) {
        [view setMapBlock: MAPBLOCK({
            // 時間でソートってこと?
            id date = doc[@"created_at"];
            emit(@[date], doc);
        }) reduceBlock: nil version: @"0"]; //
    }
    
    CBLQuery* query = [view query];
    query.descending = YES;
    return query;
}

@end
