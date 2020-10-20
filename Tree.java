import javax.lang.model.util.ElementScanner6;

class Tree {
private String treeName;
private String treeType;
private boolean leavesFall;
private String leafColor;

Tree() {
treeName = "";
treeType = "";
leavesFall = false;
leafColor = "";
}

Tree(String atreeName, String atreeType, boolean aleavesFall, String aleafColor) {
treeName = atreeName;
treeType = atreeType;
leavesFall = aleavesFall;
leafColor = aleafColor;
}


void setTreeName(String theTreeName){
  treeName = theTreeName;
}

void settreeType(String theTreeType){
  treeType = theTreeType;
}

void setleavesFall(boolean theleavesFall){
  leavesFall = theleavesFall;
}

void setleafColor(String theLeafColor){
  leafColor = theLeafColor;
}

String getType(){
  return treeType;
}

String getTreeName(){
  return treeName;
}

boolean getLeavesFall(){
  return leavesFall;
}

String getLeafColor(){
  return leafColor;
}





void print() {
  String dummy = "";

if (leavesFall == true)
  dummy = "does";
else
  dummy = "does not";

  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + dummy + " not lose its leaves for the winter.");
}

}