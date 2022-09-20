package com.example.agribusinessadvisor;

import java.util.ArrayList;
import java.util.List;

public class MarketExpert {
    List<String> getDescription(String crop_markets){
        List<String> market_description = new ArrayList<String>();

        if(crop_markets.equals("Fellow Farmers")){
            market_description.add("Other farmers in the area");
        }
        else if(crop_markets.equals("Individual or household consumers")){
            market_description.add("Local consumers or from other areas who buy for final consumption.");
        }
        else if(crop_markets.equals("Local retailers or vendors")){
            market_description.add("Include shops and butcheries operating at local business centres•No transport costs");
        }
        else if(crop_markets.equals("Urban retailers or vendors")){
            market_description.add("Include supermarkets, butcheries and vendors from urban areas");
        }
        else if(crop_markets.equals("Dealers or speculators")){
            market_description.add("Those buying for resale at higher prices in other places or at later dates");
        }
        else if(crop_markets.equals("Processors")){
            market_description.add("Companies who buy for value addition and conversion into final products - include abattoirs and manufacturers");
        }
        else if(crop_markets.equals("Institutional Consumers")){
            market_description.add("Schools, hospitals, churches and other organizational buyers who buy for final consumption");
        }
        else if(crop_markets.equals("Non Governmental Organisations")){
            market_description.add("Development organizations buying for projects");
        }
        else if(crop_markets.equals("Government bodies or parastatals")){
            market_description.add("Arms of the government with a mandate to buy and process or sell agricultural products - like GMB and CSC");
        }
        else if(crop_markets.equals("Travellers")){
            market_description.add("Public buyers passing by to other areas");
        }
        else{
            market_description.add("Customers beyond national border");
        }

        return market_description;

    }

    List<String> getAdvantages(String crop_markets){
        List<String> market_advantages = new ArrayList<String>();

        if(crop_markets.equals("Fellow Farmers")){
            market_advantages.add("No transport costs");
            market_advantages.add("Chance to build relations");
        }
        else if(crop_markets.equals("Individual or household consumers")){
            market_advantages.add("Can offer good prices.");
            market_advantages.add("No transport costs");
        }
        else if(crop_markets.equals("Local retailers or vendors")){
            market_advantages.add("Convenient and fast transactions");
            market_advantages.add("Good for learning and research");
        }
        else if(crop_markets.equals("Urban retailers or vendors")){
            market_advantages.add("High potential for regular business");
            market_advantages.add("Buying in bulk");
        }
        else if(crop_markets.equals("Dealers or speculators")){
            market_advantages.add("Assist in wide product distribution");
            market_advantages.add("Mostly pay cash on the spot");
        }
        else if(crop_markets.equals("Processors")){
            market_advantages.add("Buy in bulk");
            market_advantages.add("Can have long term contracts");
            market_advantages.add("Can support with inputs");
            market_advantages.add("Opportunities for long-term relations");
        }
        else if(crop_markets.equals("Institutional Consumers")){
            market_advantages.add("Buy in large quantities");
            market_advantages.add("Offer good prices");
            market_advantages.add("Opportunities for long-term relations");
            }
        else if(crop_markets.equals("Non Governmental Organisations")){
            market_advantages.add("Give accurate information");
            market_advantages.add("Can be good business ambassadors");
            market_advantages.add("Buy in bulk");
        }
        else if(crop_markets.equals("Government bodies or parastatals")){
            market_advantages.add("Buy in bulk");
            market_advantages.add("Long term relations");
            market_advantages.add("Can support with inputs");
            market_advantages.add("Spread orders as a social responsibility");
        }
        else if(crop_markets.equals("Travellers")){
            market_advantages.add("Can be good ambassadors");
            market_advantages.add("Buy in a hurry");
            market_advantages.add("Can produce good margins");
            }
        else{
            market_advantages.add("Exposure to other countries");
            market_advantages.add("High return potential");
        }

        return market_advantages;

    }

    List<String> getDisadvantages(String crop_markets){
        List<String> market_disadvantages = new ArrayList<String>();

        if(crop_markets.equals("Fellow Farmers")){
            market_disadvantages.add("Prices usually low ");
        }
        else if(crop_markets.equals("Individual or household consumers")){
            market_disadvantages.add("Buy in small quantities ");
           }
        else if(crop_markets.equals("Local retailers or vendors")){
            market_disadvantages.add("They dictate prices ");
            market_disadvantages.add("Low demand due to few buyers");
        }
        else if(crop_markets.equals("Urban retailers or vendors")){
            market_disadvantages.add("Can feed farmers with wrong information ");
            market_disadvantages.add("Dictate prices");
        }
        else if(crop_markets.equals("Dealers or speculators")){
            market_disadvantages.add("Can feed farmers with wrong information ");
            market_disadvantages.add("Heavily negotiate prices");
            }
        else if(crop_markets.equals("Processors")){
            market_disadvantages.add("Delays in payment ");
            market_disadvantages.add("Failure to honour contractual agreements");
            market_disadvantages.add("Sometimes dictate prices");

        }
        else if(crop_markets.equals("Institutional Consumers")){
            market_disadvantages.add("Demand formal transactions ");
            market_disadvantages.add("Have high demands for quality, reliability and consistency");
        }
        else if(crop_markets.equals("Non Governmental Organisations")){
            market_disadvantages.add("Occasional orders ");
            market_disadvantages.add("Can distort market prices");
           }
        else if(crop_markets.equals("Government bodies or parastatals")){
            market_disadvantages.add("Late payment ");
            market_disadvantages.add("Failure to fulfil promises");
            market_disadvantages.add("Slow processes");
        }
        else if(crop_markets.equals("Travellers")){
            market_disadvantages.add("Buy small quantities");
            market_disadvantages.add("Have little time to consider buying many");
            market_disadvantages.add("No relationship");
        }
        else{
            market_disadvantages.add("Demand to high standards");
            market_disadvantages.add("Complicated processes");
            market_disadvantages.add("quickly affected by government policies");
        }

        return market_disadvantages;

    }
}
