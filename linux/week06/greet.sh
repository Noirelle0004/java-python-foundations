#!/bin/bash
name=$1
if [ -z "$name" ]; then
echo "Please enter a name"
else
echo "Hello.$name"
fi
