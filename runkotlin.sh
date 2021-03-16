DIR=$1
FILE=$2

cd $DIR

echo
echo "compiling ${FILE}.kt to ${FILE}.jar file..."
kotlinc "${FILE}.kt" -include-runtime -d "${FILE}.jar"
echo 

if [[ $? -ne 0 ]]
then
	echo "Compilation failed..."
	echo 
else
	echo "Successfully created ${FILE}.jar file..."
	echo "Executing ${FILE}.jar file..."	
	echo 
	java -jar ${FILE}.jar
	echo 
	echo "End of execution..."
	echo "Terminating..."
fi




