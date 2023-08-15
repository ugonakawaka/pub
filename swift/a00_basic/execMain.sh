#!/bin/bash


# SWIFT_VERSION=$(swift -version)
SWIFT_VERSION=5.9.0
MAIN=main

echo $SWIFT_VERSION
echo $MAIN
rm $MAIN
cmd1="swiftformat $1.swift --swiftversion $SWIFT_VERSION"
cmd2="swiftc $1.swift -o $MAIN"
echo "##########################"
$cmd1 && $cmd2 && {
  ./$MAIN
}
echo "##########################"

