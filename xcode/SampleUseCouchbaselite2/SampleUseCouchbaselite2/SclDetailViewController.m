//
//  SclDetailViewController.m
//  SampleUseCouchbaselite2
//
//  Created by nakawaka shigeto on 2013/11/07.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import "SclDetailViewController.h"

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
    // Update the user interface for the detail item.

    if (self.detailItem) {
        Memo* memo = (Memo*)self.detailItem;
        self.detailDescriptionLabel.text = [memo.created_at description];
        self.memo.text = memo.memo;
        self.txtTitle.text = memo.title;
    }
}

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    [self configureView];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)save:(id)sender {
    if (self.detailItem) {
        Memo *memo = (Memo*)self.detailItem;
        memo.title = self.txtTitle.text;
        memo.memo = self.memo.text;
        
        NSError* error;
        BOOL ok = [memo save: &error];
        if (ok) {
            NSLog(@"**** save memo");
        }
    }
}
@end
