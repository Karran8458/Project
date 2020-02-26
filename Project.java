class Project {
    private String name;
    private String description;

    public Project() {
        
    }
    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
		this.description = description;
    }
	
	public String changeName(String name)
	{
		this.name = name;
		return name;
	}
	
	public String changeDesc(String name)
	{
		this.description = description;
		return description;
	}

}
