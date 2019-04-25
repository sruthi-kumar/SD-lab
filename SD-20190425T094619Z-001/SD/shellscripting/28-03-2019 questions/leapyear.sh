echo "enter year"
read a 
if [ $(( $a % 4 )) -eq 0 ]
then
echo "leap year"
else
echo "no leapyear"
fi 
