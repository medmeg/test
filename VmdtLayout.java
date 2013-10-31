public class VmdtLayout extends ViewGroup {

    public VmdtLayout(Context context) {
        super(context, null);
    }
    public VmdtLayout(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }
    public VmdtLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
        // chaque vue contenu dans le ViewGroup mesure ses propores dimensions
        // A partir de ces mesures on calcul la distribution relatives des icônes
        }
    }
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
        // Positionne cahque vue fils du ViewGroup dans le layout
        }
    }
}

public ArrayList<String> getFiles(String DirectoryPath) {
        ArrayList<String> MyFiles = new ArrayList<String>();
        File f = new File(DirectoryPath);
        f.mkdirs();
        // Récupération des fichiers
        File[] files = f.listFiles();
        if (files.length == 0)
            return null;
        else {
            for (int i=0; i<files.length; i++)
            	if(files[i].getName().endsWith("pdf")){
            	    // Ajout uniquement des fichiers pdf
            		MyFiles.add(files[i].getName());
            	}
        }

        return MyFiles;
}

public void onClick(View v)
{
	TextView textView = (TextView) v ;
	// Récupération du nom du fichier
	CharSequence fileName = textView.getText() ;
	
    String path = Environment.getExternalStorageDirectory().getAbsolutePath()+ "/Android/data/" + packageName + "/files/";
    
    // ouverture du fichier selectionné
	File file = new File(path + fileName) ;
	
	Intent target = new Intent(Intent.ACTION_VIEW);
	target.setDataAndType(Uri.fromFile(file),"text/plain");
	target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	// Creation d'un intent qui permet de choisir un logiciel de lecture 
    Intent intent = Intent.createChooser(target, "Open File");
	try {
	    startActivity(intent);
	} catch (ActivityNotFoundException e) {
	    // En cas de non reconnaisance de l'extension un message d'erreur est affiche
		Toast.makeText(getApplicationContext(), "Application to open this file is not
		available", Toast.LENGTH_LONG).show();
	} 
}
