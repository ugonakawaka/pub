//
//  SclMasterViewController.h
//  SampleUseCouchbaselite2
//
//  Created by nakawaka shigeto on 2013/11/07.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <CouchbaseLite/CouchbaseLite.h>

@interface SclMasterViewController : UIViewController<CBLUITableDelegate>
@property (strong, nonatomic) IBOutlet CBLUITableSource *dataSource;
@property (strong, nonatomic) IBOutlet UITableView *tableView;

@end
