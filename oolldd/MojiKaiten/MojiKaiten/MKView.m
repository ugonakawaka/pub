//
//  MKView.m
//  MojiKaiten
//
//  Created by nakawaka shigeto on 2013/11/13.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import "MKView.h"
#import <CoreText/CoreText.h>

#ifndef radians
#define radians(degrees) (degrees * M_PI/180)
#endif

@implementation MKView

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
    }
    return self;
}


// Only override drawRect: if you perform custom drawing.
// An empty implementation adversely affects performance during animation.
- (void)drawRect:(CGRect)rect
{
  // Drawing code
  CGContextRef context = UIGraphicsGetCurrentContext();
  CGContextSaveGState(context);
  
  CGFloat height = self.bounds.size.height;
  CGContextTranslateCTM(context, 0.0, height);
  // Flip the context coordinates, in iOS only.
  CGContextScaleCTM(context, 1.0, - 1.0);

  CGContextSelectFont(context, "Helvetica", 12, kCGEncodingMacRoman);
  CGContextSetCharacterSpacing(context, 10);
  CGContextSetTextDrawingMode(context, kCGTextFillStroke);
  CGContextSetRGBFillColor(context, 0, 0, 0, 1);
  CGContextSetRGBStrokeColor(context, 0, 0, 0, 1);
  
  // CFStringRef textString = CFSTR("");
  
  //
  NSString * nstr = @"1山23川abc";
  CFStringRef textString = (CFStringRef)CFBridgingRetain(nstr);

  CFMutableAttributedStringRef attrString = CFAttributedStringCreateMutable(kCFAllocatorDefault, 0);
  CFAttributedStringReplaceString (attrString, CFRangeMake(0, 0), textString);
  CTLineRef line = CTLineCreateWithAttributedString(attrString);
  CFRelease(textString);
  CFRelease(attrString);
  //run count
  CFArrayRef runArray = CTLineGetGlyphRuns(line);
  CFIndex runCount = CFArrayGetCount(runArray);
  CFIndex runIndex = 0;
  int posY = 30;
  CGContextSaveGState(context);
  for(runIndex = 0; runIndex < runCount; runIndex++) {
    // posY += 30;
    
    {
      
      CTRunRef run = (CTRunRef)CFArrayGetValueAtIndex(runArray, runIndex);
      CGContextSetTextPosition(context, 130, posY);
      
      // CGAffineTransform trans = CGAffineTransformIdentity;
      CGAffineTransform trans = CTRunGetTextMatrix(run);
      if ( CGAffineTransformIsIdentity (trans) ){
        //アフィン変換していない時の処理
        NSLog(@"** 変換していない");
      }
      trans = CGAffineTransformScale( trans, 3, 2);
      //trans = CGAffineTransformRotate( trans, 3.14/2);  //90度回転,単位はラジアン
      //CGContextSetTextMatrix(context, trans);
      CGContextConcatCTM(context, trans);
      CTRunDraw(run, context, CFRangeMake(0, 0));
      
     // NSLog(@"***2 %f", );
      
    }
  }
  CGContextRestoreGState(context);


  CGContextSaveGState(context);
  for(runIndex = 0; runIndex < runCount; runIndex++) {
    // posY += 30;
    if(true){
      
      CGContextRotateCTM(context, radians(10));
      CTRunRef run = (CTRunRef)CFArrayGetValueAtIndex(runArray, runIndex);
      CGContextSetTextPosition(context, 130, posY);
      CTRunDraw(run, context, CFRangeMake(0, 0));
      
      NSLog(@"***1");
      
    }
  }
  CGContextRestoreGState(context);



  CGContextRestoreGState(context);
}


@end
