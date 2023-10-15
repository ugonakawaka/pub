//
//  ViewController.m
//  MojiKaiten
//
//  Created by nakawaka shigeto on 2013/11/13.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)sliderChanged:(id)sender {
  
  UISlider *slider = (UISlider*)sender;
  
  self.kaitenView.degree = slider.value;
  self.kaitenViewNSString.degree = slider.value;
  
  [self.kaitenView setNeedsDisplay];
  [self.kaitenViewNSString setNeedsDisplay];
  
}
@end
