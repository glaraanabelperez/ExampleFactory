package Fox;

public class FichaTecnica {
	enum SubCategoriasCam{
		COMPACTA("compacta"), REFLEX("reflex"), ACUATICAS("acuatica");
		private String subCategoriaEnum;
		SubCategoriasCam(String subCategoriaEnum){
			this.subCategoriaEnum=subCategoriaEnum;
		}
		public String getsubCategoriaEnum() {
			return subCategoriaEnum;
		}
	};
////CONSTRUCTOR DE SUBCATEGORIAS CON SUBCLASE ENUM
	private String subCategoriasCam;
	
	FichaTecnica(){
		subCategoriasCam="Sin contenido";
	}
	
	public void setCategoriaCam(String catCam) {
		SubCategoriasCam newCat=Enum.valueOf(SubCategoriasCam.class,catCam);
		//Manda hacia clase enum y establece el valueOf//
		this.subCategoriasCam=newCat.getsubCategoriaEnum();
		//ESTE subCategoriasCam es del BuilCamara. y toma el metodo de enum
	}
	public String getsubCategoriasCam() {
		return subCategoriasCam;
	}
}
