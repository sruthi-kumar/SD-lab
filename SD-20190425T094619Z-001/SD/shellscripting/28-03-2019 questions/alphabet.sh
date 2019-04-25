echo "enter a value"
read val;
ra='[a-zA-Z]'
if [[ "$val" =~ $ra ]]
then 
if [[ "$val" == *[AEIOUaeiou]* ]] 
then
echo "$val is a vowel"
else
echo "$val is a consonant"
fi
else
echo "not an alphabet"
fi

