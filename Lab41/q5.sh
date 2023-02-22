echo "Menu"
echo "1. Search"
echo "2. Delete"
echo "3. Exit"
echo "Enter patt"
read patt
echo "enter Filename"
read file
echo "Enter choice"
read choice
case $choice in
1) grep -e "$patt" $file;;
2) sed -i "/$patt/d" $file;;
3) exit ;;
esac
echo "Done"
