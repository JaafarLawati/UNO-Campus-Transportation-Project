package graph;

class Main{
	  public static void main(String[] args) {
	    new Main();
	  }

	  public Main(){
	    Graph<String> graph = new Graph<>();

	    Node<String> ash = new Node<>("Arts and Science Hall");
	    Node<String> mammel = new Node<>("Mammel Hall");
	    Node<String> wfab = new Node<>("Weber Fine Arts Building");
	    Node<String> rosken = new Node<>("Roskens Hall");
	    Node<String> pki = new Node<>("Peter Kiewit Institute");
	    Node<String> cpacs = new Node<>("CPACS Building");
	    Node<String> baxter = new Node<>("Baxter Arena");
	    Node<String> hk = new Node<>("H&K Builing");
	    Node<String> criss = new Node<>("Criss Library");
	    Node<String> mbsc = new Node<>("Milo Bail Student Center");
	    Node<String> mv = new Node<>("Maverick Village");
	    Node<String> uv = new Node<>("University Village");
	    Node<String> cross = new Node<>("Scott Crossing");
	    

	    graph.addNode(ash);
	    graph.addNode(mammel);
	    graph.addNode(wfab);
	    graph.addNode(rosken);
	    graph.addNode(pki);
	    graph.addNode(cpacs);
	    graph.addNode(baxter);
	    graph.addNode(hk);
	    graph.addNode(criss);
	    graph.addNode(mbsc);
	    graph.addNode(mv);
	    graph.addNode(uv);
	    graph.addNode(cross);

	    ash.addEdge(new DirectedEdge<String>(wfab, 10));
	    ash.addEdge(new DirectedEdge<String>(rosken, 2));
	    ash.addEdge(new DirectedEdge<String>(cpacs, 4));
	    ash.addEdge(new DirectedEdge<String>(hk, 7));
	    ash.addEdge(new DirectedEdge<String>(criss, 8));
	    ash.addEdge(new DirectedEdge<String>(mbsc, 4));
	    ash.addEdge(new DirectedEdge<String>(mv, 17));
	    ash.addEdge(new DirectedEdge<String>(uv, 15));
	    
	    wfab.addEdge(new DirectedEdge<String>(ash, 10));
	    wfab.addEdge(new DirectedEdge<String>(rosken, 9));
	    wfab.addEdge(new DirectedEdge<String>(cpacs, 5));
	    wfab.addEdge(new DirectedEdge<String>(hk, 4));
	    wfab.addEdge(new DirectedEdge<String>(criss, 2));
	    wfab.addEdge(new DirectedEdge<String>(mbsc, 5));
	    wfab.addEdge(new DirectedEdge<String>(mv, 7));
	    wfab.addEdge(new DirectedEdge<String>(uv, 5));
	    
	    rosken.addEdge(new DirectedEdge<String>(ash, 2));
	    rosken.addEdge(new DirectedEdge<String>(wfab, 9));
	    rosken.addEdge(new DirectedEdge<String>(cpacs, 5));
	    rosken.addEdge(new DirectedEdge<String>(hk, 8));
	    rosken.addEdge(new DirectedEdge<String>(criss, 6));
	    rosken.addEdge(new DirectedEdge<String>(mbsc, 4));
	    rosken.addEdge(new DirectedEdge<String>(mv, 11));
	    rosken.addEdge(new DirectedEdge<String>(uv, 11));
	    
	    cpacs.addEdge(new DirectedEdge<String>(ash, 4));
	    cpacs.addEdge(new DirectedEdge<String>(wfab, 5));
	    cpacs.addEdge(new DirectedEdge<String>(rosken, 5));
	    cpacs.addEdge(new DirectedEdge<String>(hk, 5));
	    cpacs.addEdge(new DirectedEdge<String>(criss, 4));
	    cpacs.addEdge(new DirectedEdge<String>(mbsc, 2));
	    cpacs.addEdge(new DirectedEdge<String>(mv, 13));
	    cpacs.addEdge(new DirectedEdge<String>(uv, 11));
	    
	    hk.addEdge(new DirectedEdge<String>(ash, 7));
	    hk.addEdge(new DirectedEdge<String>(wfab, 4));
	    hk.addEdge(new DirectedEdge<String>(rosken, 8));
	    hk.addEdge(new DirectedEdge<String>(cpacs, 5));
	    hk.addEdge(new DirectedEdge<String>(criss, 4));
	    hk.addEdge(new DirectedEdge<String>(mbsc, 5));
	    hk.addEdge(new DirectedEdge<String>(mv, 9));
	    hk.addEdge(new DirectedEdge<String>(uv, 7));
	    
	    criss.addEdge(new DirectedEdge<String>(ash, 8));
	    criss.addEdge(new DirectedEdge<String>(wfab, 2));
	    criss.addEdge(new DirectedEdge<String>(rosken, 6));
	    criss.addEdge(new DirectedEdge<String>(cpacs, 4));
	    criss.addEdge(new DirectedEdge<String>(hk, 4));
	    criss.addEdge(new DirectedEdge<String>(mbsc, 5));
	    criss.addEdge(new DirectedEdge<String>(mv, 7));
	    criss.addEdge(new DirectedEdge<String>(uv, 5));
	    criss.addEdge(new DirectedEdge<String>(mammel, 6));
	    
	    
	    mbsc.addEdge(new DirectedEdge<String>(ash, 4));
	    mbsc.addEdge(new DirectedEdge<String>(wfab, 5));
	    mbsc.addEdge(new DirectedEdge<String>(rosken, 4));
	    mbsc.addEdge(new DirectedEdge<String>(cpacs, 2));
	    mbsc.addEdge(new DirectedEdge<String>(hk, 5));
	    mbsc.addEdge(new DirectedEdge<String>(criss, 4));
	    mbsc.addEdge(new DirectedEdge<String>(mv, 13));
	    mbsc.addEdge(new DirectedEdge<String>(uv, 11));
	    
	    mv.addEdge(new DirectedEdge<String>(ash, 17));
	    mv.addEdge(new DirectedEdge<String>(wfab, 7));
	    mv.addEdge(new DirectedEdge<String>(rosken, 11));
	    mv.addEdge(new DirectedEdge<String>(cpacs, 13));
	    mv.addEdge(new DirectedEdge<String>(hk, 9));
	    mv.addEdge(new DirectedEdge<String>(criss, 7));
	    mv.addEdge(new DirectedEdge<String>(mbsc, 13));
	    mv.addEdge(new DirectedEdge<String>(uv, 2));
	    
	    uv.addEdge(new DirectedEdge<String>(ash, 15));
	    uv.addEdge(new DirectedEdge<String>(wfab, 5));
	    uv.addEdge(new DirectedEdge<String>(rosken, 11));
	    uv.addEdge(new DirectedEdge<String>(cpacs, 11));
	    uv.addEdge(new DirectedEdge<String>(hk, 7));
	    uv.addEdge(new DirectedEdge<String>(criss, 5));
	    uv.addEdge(new DirectedEdge<String>(mbsc, 11));
	    uv.addEdge(new DirectedEdge<String>(mv, 2));
	    
	    
	    mammel.addEdge(new DirectedEdge<String>(pki, 5));
	    mammel.addEdge(new DirectedEdge<String>(cross, 2));
	    mammel.addEdge(new DirectedEdge<String>(baxter, 13));
	    mammel.addEdge(new DirectedEdge<String>(criss, 6));
	    
	    pki.addEdge(new DirectedEdge<String>(mammel, 5));
	    pki.addEdge(new DirectedEdge<String>(cross, 6));
	    pki.addEdge(new DirectedEdge<String>(baxter, 17));
	    
	    cross.addEdge(new DirectedEdge<String>(pki, 6));
	    cross.addEdge(new DirectedEdge<String>(mammel, 2));
	    cross.addEdge(new DirectedEdge<String>(baxter, 11));
	    
	    baxter.addEdge(new DirectedEdge<String>(pki, 17 ));
	    baxter.addEdge(new DirectedEdge<String>(cross, 11));
	    baxter.addEdge(new DirectedEdge<String>(mammel, 13));
	    
	    
	    
	    
	    
	    System.out.println("graph.howLong(pki, pki);");
	    graph.howLong(pki, pki);
	    System.out.println("-----------");
	    
	    System.out.println("graph.howLong(pki, mammel);");
	    graph.howLong(pki, mammel);
	    System.out.println("-----------");
	    
	    System.out.println("graph.howLong(pki, ash);");
	    graph.howLong(pki, ash);
	    System.out.println("-----------");
	    
	    System.out.println("graph.howLong(uv, mbsc);");
	    graph.howLong(uv, mbsc);
	    System.out.println("-----------");
	    
	    System.out.println("graph.howLong(mv, rosken);");
	    graph.howLong(mv, rosken);
	    System.out.println("-----------");
	    
	    System.out.println("graph.howLong(hk, baxter);");
	    graph.howLong(hk, baxter);
	    System.out.println("-----------");
	    
	    
	    
	    


	  }
	}
