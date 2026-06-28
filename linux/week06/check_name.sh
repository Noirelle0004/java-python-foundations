#!/bin/bash
check_name() {
 name=$1
if [ -z "$name" ]; then
 echo "Name is enpty"
return 1
else
echo "Hello,$name"
return 0
fi
}
check_name $1
echo "status:$?"
