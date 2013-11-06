//
//  SclDetailViewController.h
//  SampleUseCouchbaselite
//
//  Created by nakawaka shigeto on 2013/11/06.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface SclDetailViewController : UIViewController

@property (strong, nonatomic) id detailItem;

@property (weak, nonatomic) IBOutlet UILabel *detailDescriptionLabel;

@property (weak, nonatomic) IBOutlet UITextField *textTitle;
@property (weak, nonatomic) IBOutlet UITextView *textMemo;

- (IBAction)save:(id)sender;
@end
