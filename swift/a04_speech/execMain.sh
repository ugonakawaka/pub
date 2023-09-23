#!/bin/bash

# 拡張子
ext=".swift"

# 引数を変数に格納
input="$1"

# 変数の末尾にマッチ
result="${input%$ext}"

swiftformat $result.swift
echo $?
# swiftc $1.swift -suppress-warnings
# デバッガ情報あり
swiftc -g $result.swift
case $? in
	0 ) ./$result ;;
	* ) echo "no exec";;
esac
