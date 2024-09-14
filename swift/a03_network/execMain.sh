#!/bin/bash

swiftformat $1.swift
echo $?
# swiftc $1.swift -suppress-warnings
swiftc $1.swift
case $? in
	0 ) ./$1 ;;
	* ) echo "no exec";;
esac
