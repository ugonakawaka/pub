//
//  ViewController.h
//  MojiKaiten
//
//  Created by nakawaka shigeto on 2013/11/13.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "MK2View.h"
#import "MKView.h"
@interface ViewController : UIViewController
- (IBAction)sliderChanged:(id)sender;
@property (weak, nonatomic) IBOutlet MK2View *kaitenViewNSString;
@property (weak, nonatomic) IBOutlet MKView *kaitenView;

@end
