sparql = require("sparql");
client = new sparql.Client("https://world.openfoodfacts.org/cgi/search.pl?action=process&search_terms=biscuit&tagtype_0=countries&tag_contains_0=contains&tag_0=Romania&sort_by=completeness&page_size=40&axis_x=energy&axis_y=products_n&action=display")


client.query('select distinct ?name where { ?s foaf:name ?name } limit 10', (err, res) => {
    for (rdf_value in res){
        console.log( rdf_value.value ) 
    }
})
   