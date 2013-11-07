//
//  Memo.h
//  SampleUseCouchbaselite
//
//  Created by nakawaka shigeto on 2013/11/06.
//  Copyright (c) 2013年 deiji.jp. All rights reserved.
//

#import <CouchbaseLite/CouchbaseLite.h>

@interface Memo : CBLModel
@property bool check;
@property (copy) NSString* title;
@property (copy) NSString* memo;
@property (strong) NSDate* created_at;

@end
