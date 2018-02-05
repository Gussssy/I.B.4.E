public class Nodule{

	String word;
	Nodule[] children;

	//Belong in the main. 
	int max;
	int count; 

	//Root node
	public Nodule(){
		word = "";

	}

	//Normal node
	public Nodule(String word, String alphabet){
		this.word = word;

	}

	//Should be in main class, make children with valid strings only
	public void makeChildren(Nodule nod){
		char[] letters = toCharArray();
		for(char c : letters){
			word = word + c
			//VALIDATE THE WORD
			System.out.println(word);
			Nodule child = new Nodule(word,alphabet){
			}
	}

	public traverse(Nodule nod){

		//If word is max size, count it and return
		if (nod.word.size() == max){
				count ++;
			}else{
				makeChildren(nod);
			}

		for(Nodule nodlit : nod.children){
			traverse(nodlit);
		}
	}
}