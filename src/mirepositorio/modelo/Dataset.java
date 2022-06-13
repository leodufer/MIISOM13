package mirepositorio.modelo;

public class Dataset {
	private String name;
	private String description;
	private String link;
	private String category;
	private String cloud;
	private String vintage;
	
	public Dataset(String name, String description, String link, String category, String cloud, String vintage) {
		this.name = name;
		this.description = description;
		this.link = link;
		this.category = category;
		this.cloud = cloud;
		this.vintage = vintage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public String getVintage() {
		return vintage;
	}
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}
	@Override
	public String toString() {
		return "Dataset [name=" + name + ", description=" + description + ", link=" + link + ", category=" + category
				+ ", cloud=" + cloud + ", vintage=" + vintage + "]";
	}
	
}
