//
//  SclDetailViewController.m
//  SampleUseCouchbaselite
//
//  Created by nakawaka shigeto on 2013/11/06.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import "SclDetailViewController.h"
#import <CouchbaseLite/CouchbaseLite.h>
#import "Memo.h"

@interface SclDetailViewController ()
- (void)configureView;
@end

@implementation SclDetailViewController

#pragma mark - Managing the detail item

- (void)setDetailItem:(id)newDetailItem
{
    if (_detailItem != newDetailItem) {
        _detailItem = newDetailItem;
        
        // Update the view.
        [self configureView];
    }
}

- (void)configureView
{
    if (self.detailItem) {
        
        Memo *memo = (Memo*)self.detailItem;
        
        self.textTitle.text = memo.title;
        self.textMemo.text = memo.memo;
    }
}

- (void)viewDidLoad
{
    [super viewDidLoad];
    [self configureView];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
}

- (IBAction)save:(id)sender {
    if (self.detailItem) {
        Memo *memo = (Memo*)self.detailItem;
        memo.title = self.textTitle.text;
        memo.memo = self.textMemo.text;

        NSError* error;
        BOOL ok = [memo save: &error];
        if (ok) {
            NSLog(@"**** save memo");
        }
    }
}
@end
