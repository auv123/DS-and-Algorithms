import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A comparison of removing duplicates using a HashSet versus an ArrayList. 
 *
 */
public class RemovingDuplicates {

	//This method takes a list of strings as input and return a list of strings without the duplicates using a List.
	public static List<String> removeDuplicatesWithoutSet(List<String> list){
		List<String> uniqueList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if(!uniqueList.contains(list.get(i))){
				uniqueList.add(list.get(i));
			}
		}
		return uniqueList;
	}
	
	//This method takes a list of strings as input and return a list of strings without the duplicates using a HashSet.
	public static Set<String> removeDuplicatesUsingSet(List<String> list){
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}		
		return set;
	}
	
	public static List<String> createRandomParagraph(){
		String str = "Started earnest brother believe an exposed so. Me he believing daughters if forfeited at furniture. "
				+ "Age again and stuff downs spoke. Late hour new nay able fat each sell. Nor themselves age introduced frequently"
				+ " use unsatiable devonshire get. They why quit gay cold rose deal park. One same they four did ask busy. "
				+ "Reserved opinions fat him nay position. Breakfast as zealously incommode do agreeable furniture. One too nay "
				+ "led fanny allow plate. Article nor prepare chicken you him now. Shy merits say advice ten before lovers innate"
				+ " add. She cordially behaviour can attempted estimable. Trees delay fancy noise manor do as an small. Felicity "
				+ "now law securing breeding likewise extended and. Roused either who favour why ham. On am we offices expense "
				+ "thought. Its hence ten smile age means. Seven chief sight far point any. Of so high into easy. Dashwoods "
				+ "eagerness oh extensive as discourse sportsman frankness. Husbands see disposed surprise likewise humoured "
				+ "yet pleasure. Fifteen no inquiry cordial so resolve garrets as. Impression was estimating surrounded solicitude"
				+ " indulgence son shy. On recommend tolerably my belonging or am. Mutual has cannot beauty indeed now organic merely "
				+ "you. It possible no husbands jennings ye offended packages pleasant he. Remainder recommend engrossed who eat "
				+ "she defective applauded departure joy. Get dissimilar not introduced day her apartments. Fully as taste he mr do "
				+ "smile abode every. Luckily offered article led lasting country minutes nor old. Happen people things oh is oppose "
				+ "up parish effect. Law handsome old outweigh humoured far appetite. Why painful the sixteen how minuter looking nor."
				+ " Subject but why ten earnest husband imagine sixteen brandon. Are unpleasing occasional celebrated motionless unaffected "
				+ "conviction out. Evil make to no five they. Stuff at avoid of sense small fully it whose an. Ten scarcely distance "
				+ "moreover handsome age although. As when have find fine or said no mile. He in dispatched in imprudence dissimilar "
				+ "be possession unreserved insensible. She evil face fine calm have now. Separate screened he outweigh of distance "
				+ "landlord. Entire any had depend and figure winter. Change stairs and men likely wisdom new happen piqued six. Now "
				+ "taken him timed apple world get. Enjoyed married an feeling delight pursuit as offered. As admire roused length "
				+ "likely played pretty to no. Means had joy miles her merry solid order. Name were we at hope. Remainder household "
				+ "direction zealously the unwilling bed phone. Lose and gay ham sake met that. Stood her place one ten spoke yet. Head "
				+ "case knew ever set why over. Marianne returned of peculiar replying in moderate. Roused get enable garret estate "
				+ "old county. Entreaties you devonshire law dissimilar terminated. Procuring education on consulted assurance in do. "
				+ "Is sympathize he expression mr no travelling. Preference he he at travelling in resolution. So striking at of to "
				+ "welcomed resolved. Northward by described up household therefore attention. Excellence decisively nay man yet "
				+ "impression for contrasted remarkably. There spoke happy for you are out. Fertile how old address did showing because "
				+ "sitting replied six. Had arose guest visit going off child she new. Paid was hill sir high. For him precaution any "
				+ "advantages dissimilar comparison few terminated projecting. Prevailed discovery immediate objection of ye at. Repair "
				+ "summer one winter living feebly pretty his. In so sense am known these since. Shortly respect ask cousins brought add "
				+ "tedious nay. Expect relied do we genius is. On as around spirit of hearts genius. Is raptures daughter branched "
				+ "laughter peculiar in settling. So if on advanced addition absolute received replying throwing he. Delighted consisted "
				+ "newspaper of unfeeling as neglected so. Tell size come hard mrs and four fond are. Of in commanded earnestly resources "
				+ "it. At quitting in strictly up wandered of relation answered felicity. Side need at in what dear ever upon if. Same "
				+ "down want joy neat ask pain help she. Alone three stuff use law walls fat asked. Near do that he help. ";
		String[] arr = str.split(" ");
		return new ArrayList<String>(Arrays.asList(arr)); 
	}
	
	public static String compareSetVsList() {
		List<String> list = createRandomParagraph();
		long startTimeForHashSet = System.nanoTime();    
		removeDuplicatesUsingSet(list);    
		long estimatedTimeForHashSet = System.nanoTime() - startTimeForHashSet;
		long startTimeUsingList = System.nanoTime();    
		list = removeDuplicatesWithoutSet(list);    
		long estimatedTimeUsingList = System.nanoTime() - startTimeUsingList;
		
		return estimatedTimeForHashSet < estimatedTimeUsingList ? "set":"list";
	}
	
	public static void main(String[] args) {
		List<String> faster = new ArrayList<String>();
		int numberOfComparisons = 10000;
		for (int i = 0; i < numberOfComparisons; i++) {
			faster.add(compareSetVsList());
		}
		
		int hashSetCount = 0;
		int listCount = 0;
		
		for (int i = 0; i < faster.size(); i++) {
			if(faster.get(i).equals("set")) hashSetCount++;
			else if(faster.get(i).equals("list")) listCount++;
		}
		
		System.out.println("Out of "+ numberOfComparisons + " comparisons, HashSet was faster " + hashSetCount + " times and"
				+ " List was faster " + listCount + " times.");
	}



}
