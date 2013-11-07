//
//  SclDetailViewController.h
//  SampleUseCouchbaselite2
//
//  Created by nakawaka shigeto on 2013/11/07.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "Memo.h"

@interface SclDetailViewController : UIViewController

@property (strong, nonatomic) id detailItem;

@property (weak, nonatomic) IBOutlet UITextView *memo;
@property (weak, nonatomic) IBOutlet UITextField *txtTitle;
@property (weak, nonatomic) IBOutlet UILabel *detailDescriptionLabel;

- (IBAction)save:(id)sender;
@end
