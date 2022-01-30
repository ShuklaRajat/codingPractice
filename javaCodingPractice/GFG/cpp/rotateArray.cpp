#include <iostream>
using namespace std;

int rotatedArrayFunc(int numElem, int rotNum, int *arrElem){
    int rotArr[numElem];
    
    for(int i=0; i < numElem; i++){
        // rotArr[i] = arrElem[rotNum++];
        cout<<arrElem[rotNum++]<<" ";
        if(rotNum==numElem){
            rotNum = 0;
        }
    }
    cout<<endl;
}

int main() {
	int testCase;
	cin>>testCase;
	
	while (testCase--){
	    int numElem;
	    int rotNum;
	    
	    cin>>numElem;
	    cin>>rotNum;
	    
	    int arrElem[numElem];
	    
	    for(int i=0; i < numElem; i++){
            cin>>arrElem[i];	        
	    }
	    rotatedArrayFunc(numElem, rotNum, arrElem);
	}
	return 0;

}