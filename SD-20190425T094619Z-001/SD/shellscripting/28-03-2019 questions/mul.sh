echo "enter a number"
read a
echo "multiplication table"
for (( i=1; i<=10; i++ ))
do
echo "$i * $a = $(( $a * $i ))"
done
