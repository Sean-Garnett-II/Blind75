#!/bin/bash

input="Blind75links.txt"
rm test.txt
rm output.txt
touch test.txt

echo "</p><h3>Array</h3>" >>test.txt
echo '<li><a href="https://leetcode.com/problems/two-sum/">Two Sum</a></li>' >>test.txt

input="test.txt"
while IFS= read -r line
do
var1=
var2=

var1=$(echo $line | grep -oP "http(s)?:[\w\h\/.-]+")


if [ -n "$var1" ]
    then
    var2=$(echo $line | grep -oP ">[\w\h]+<")
    var2=$(echo $var2 | grep -oP "[\w\h]+")
    echo "[$var2]($var1)" >>output.txt
    fi

var1=$(echo $line | grep -oP "<h3>[\w\h]+<\/h3>")
if [ -n "$var1" ]
  then
  echo ""
  var1=$(echo $var1 | sed -e "s/<h3>//g")
  var1=$(echo $var1 | sed -e "s/<\/h3>//g")
  echo $var1 >>output.txt
  fi

done < "$input"

cat output.txt
