//
//  SclAppDelegate.h
//  SampleUseCouchbaselite2
//
//  Created by nakawaka shigeto on 2013/11/07.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <CouchbaseLite/CouchbaseLite.h>

@interface SclAppDelegate : UIResponder <UIApplicationDelegate>

@property (strong, nonatomic) UIWindow *window;
@property (strong, nonatomic) CBLDatabase *database;

@end
