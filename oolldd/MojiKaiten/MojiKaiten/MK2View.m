//
//  MK2View.m
//  MojiKaiten
//
//  Created by nakawaka shigeto on 2013/11/13.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import "MK2View.h"

#ifndef radians
#define radians(degrees) (degrees * M_PI/180)
#endif
@implementation MK2View

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
    }
    return self;
}

- (CGSize) sizeWithMyFont:(NSString*)str fontToUse:(UIFont *)fontToUse
{
  NSDictionary* attribs = @{NSFontAttributeName:fontToUse};
  return ([str sizeWithAttributes:attribs]);
}



////////////////
// 参考
// http://takabosoft.com/20130913130535.html

// Only override drawRect: if you perform custom drawing.
// An empty implementation adversely affects performance during animation.
- (void)drawRect:(CGRect)rect
{
  
  CGRect viewSize = self.frame;
  CGContextRef context = UIGraphicsGetCurrentContext();

  NSDictionary* attribs = @{NSFontAttributeName:[UIFont systemFontOfSize:74]};
  
  NSString *text = @"あ";
  CGSize size = [text sizeWithAttributes:attribs];
  
  ////////////////
  // 真ん中にもってくるようにす
  float x = (viewSize.size.width / 2) - (size.width / 2)*2, y = (viewSize.size.height / 2) - (size.height / 2)*2;

  CGContextSaveGState(context);
  CGAffineTransform t = CGAffineTransformIdentity;
  t = CGAffineTransformTranslate(t, x + (size.width) / 2, y + (size.height) / 2);
  t = CGAffineTransformTranslate(t, +size.width / 2, +size.height / 2);
  float angle = radians(self.degree);
  t = CGAffineTransformRotate(t, -angle);
  t = CGAffineTransformTranslate(t, -size.width / 2, -size.height / 2);
  CGContextConcatCTM(context, t);
  [text drawAtPoint:CGPointZero withAttributes:attribs];
  CGContextRestoreGState(context);
  
  ///////////////////////////
  // 枠
  UIRectFrame(CGRectMake(x + ((size.width) / 2), y + ((size.height) / 2), size.width, size.height));
  
  { ///////////////////////////
    // 角度
    NSDictionary* attribs = @{NSFontAttributeName:[UIFont systemFontOfSize:10]};
    NSString *angleStr = [NSString stringWithFormat:@"%.1f°", angle * 180 / M_PI];
    [angleStr drawAtPoint:CGPointMake(0 + 2, 0) withAttributes:attribs];
  }
}



@end
