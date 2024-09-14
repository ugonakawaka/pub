#!/bin/bash

# SWIFT_VERSION=$(swift -version)
SWIFT_VERSION=5.9.0
MAIN=main

echo $SWIFT_VERSION
echo $MAIN
rm $MAIN
# 拡張子
ext=".swift"

# 引数を変数に格納
input="$1"

# 変数の末尾にマッチ
result="${input%$ext}"

swiftformat $result.swift --swiftversion $SWIFT_VERSION
echo $?
# swiftc $1.swift -suppress-warnings
# デバッガ情報あり
swiftc -g $result.swift
case $? in
	0 ) ./$result ;;
	* ) echo "no exec";;
esac