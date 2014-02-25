
		//launchvk;ldskffds;lf
	}

	@Override
	public void start(javafx.stage.Stage stage) throws Exception {
		stage.setTitle("Study Master");
		director.setStage(stage);
        director.pushStageWithFXML(App.class.getResource("/fxml/loginView.fxml"));
    }
}
