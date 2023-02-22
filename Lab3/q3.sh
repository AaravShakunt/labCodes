echo "Q3: Replacing .txt with .text"
rename=`find . -depth -name *.txt`
for i in $rename 
do
	echo renaming $i 
    mv $i ${i%.txt}.text
done
echo "All files renamed!"
