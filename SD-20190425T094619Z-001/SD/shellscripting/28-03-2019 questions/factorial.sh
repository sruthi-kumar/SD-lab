echo "enter a number"
read num
s=$num
fact=1
while [ $num -ge 1 ]
do
fact=$((fact * num))
num=$((num - 1))
done
echo  factorial of "$s" is $fact

