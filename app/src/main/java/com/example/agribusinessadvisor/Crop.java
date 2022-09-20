package com.example.agribusinessadvisor;

public class Crop {
    private String crop_name;
    private String land_preparation;
    private String planting;
    private String crop_management;
    private String pest_management;
    private int imageResourceId;

    //crops is an array of Crops
    public static final Crop[] crops = {
            new Crop("Maize",
                    " Can use Conservation - using basins and furrows, green and dead mulching " +
                            "and herbicides to ensure weed free field. OR Convetional - using Automn " +
                            "Ploughing and ploughing with rains to ensure weed free field",
                    "Can use water planting - 2 to 3 weeks before rain season, with water OR " +
                            "Can use dry planting - 2 to 3 weeks before rain season, without water OR" +
                            "Can use rain planting - with the first effective rains, above 20mm." +
                            "Planting depth is 5 to 7.5cm.",
                    "Keep weed free for first 6 to 8 weeks and have late weeding before harvesting." +
                            "Use herbicides - Preplanting herbicides, Glyphoset, to control remnant weeds." +
                            "Preemergence, Metalaclo, Battlagold, 2 to 3 days after planting." +
                            "Postemergence, NicoSulfron at 3 leaf stage and Stellar Star, at 6 leaf stage.",
                    "Scout on a daily basis and apply pesticides when pest economic injury level is " +
                            "reached. Scout for Fall Army worm eggs when crop is at 2 leaf stage and " +
                            "Black heads at first insta, spray using recommended pesticides ",R.drawable.maize),
            new Crop("Rapoko",
                    " Land preparation should begin just after harvesting the preceding crop." +
                            " Can use Conventional Tillage - Using the conventional plough turn the soil, burying all crop residues and weeds. " +
                            "Ploughing should always be done across the slope and ensure weed free field." +
                            " OR Reduced tillage - no ploughing " +
                            "Only create planting stations for seeds ensure weed free field. If using reduced tillage." +
                            " Dig basins (15cm long, 15cm wide & 15cm deep) at a spacing of 45 cm inter-row and 40 cm in-row " +
                            "if using basin method. OR Open planting on lines on unploughed land using a ripper tine at 45cm between " +
                            "rows. If using Conventional tillage. If the land has many clods, an ox-drawn harrow can be used to break" +
                            " the clods and create a fine tilth. Open planting lines at 45cm apart.",
                    "The best time for planting is as soon as the first effective rains (when there is enough moisture in the soil" +
                            " for seed germination) " +
                            "have been received. If using Basin Method - Plant 5 pips per basin. Cover the seeds with " +
                            "2-3 cm of clod-free soil. If using Ripper-tine method, Drill the seed thinly in the planting " +
                            "furrow so that individual seeds are 5-10 cm. Cover the seeds with 2-3 cm of clod-free soil. " +
                            "Seeds can also be drilled using a direct seeder calibrated for the particular crop. If using " +
                            "the conventional method, Drill the seed thinly in the planting furrow so that individual seeds " +
                            "are 5-10 cm. Cover the seeds with 2-3 cm of clod-free soil. Seeds can also be drilled using a " +
                            "direct seeder calibrated for the particular crop.",
                    "Thinning is very important to ensure the optimal plant population. A plant population " +
                            "that is higher than optimal will result in tall and thin plants that will produce very " +
                            "small heads, resulting in reduced yields. The first weeding should be done as soon as weeds start to emerge. " +
                            "Young plants must be kept " +
                            "weed free for the first 45 days of growth, and so weeding should be repeated as many " +
                            "times as is necessary to keep the crop weed free for this period. Late weeding is also" +
                            " recommended so that the crop is weed free at the time of harvesting. Appropriate use of " +
                            "herbicides will ensure a weed free crop. Use of pre-emergence herbicides like atrazine " +
                            "recommended in soils with greater than 25% clay content.",
                    "Warnings of imminent outbreaks are usually broadcast in the media. If such warnings " +
                            "are received, or even as a regular precautionary measure, scout the crop for the appearance " +
                            "of pests in December/January -Chemical control is possible with carbaryl, endosulfan, malathion " +
                            "and trichlorfon. Digging a shallow trench ahead of marching caterpillars will slow them down and" +
                            " concentrate them in an area where they can be physically destroyed. ",R.drawable.rapoko),
            new Crop("Pearl Millet",
                    " Land preparation should begin just after harvesting the preceding crop. " +
                            "Can use Conventional Tillage - Using the conventional plough turn the soil, burying all " +
                            "crop residues and weeds. Ploughing should always be done across the slope and ensure weed free " +
                            "field. OR Reduced tillage - No ploughing. Only create planting stations for seeds ensure weed free field. " +
                            "If using reduced tillage. Dig basins (15cm long, 15cm wide & 15cm deep) at a spacing of 75 cm inter-row" +
                            " and 40 cm in-row if using basin method. OR Open planting on lines on unploughed land using a ripper" +
                            " tine at 75cm between rows. If using Conventional tillage. If the land has many clods, an ox-drawn " +
                            "harrow can be used to break the clods and create a fine tilth. Open planting lines at 75cm apart.",
                    "The best time for planting is as soon as the first effective rains (when there is enough moisture in the" +
                            " soil for seed germination) have been received. If using Basin Method - Plant 5 pips per basin. " +
                            "Cover the seeds with 2-3 cm of clod-free soil. If using Ripper-tine method, Drill the seed thinly" +
                            " in the planting furrow so that individual seeds are 10-15 cm. Cover the seeds with 2-3 cm of " +
                            "clod-free soil. Seeds can also be drilled using a direct seeder calibrated for the particular " +
                            "crop. If using the conventional method, Drill the seed thinly in the planting furrow so that " +
                            "individual seeds are 10-15 cm. Cover the seeds with 2-3 cm of clod-free soil. Seeds can also be " +
                            "drilled using a direct seeder calibrated for the particular crop.",
                    "Thinning is very important to ensure the optimal plant population. A plant population that " +
                            "is higher than optimal will result in tall and thin plants that will produce very small heads, " +
                            "resulting in reduced yields. The first weeding should be done as soon as weeds start to emerge." +
                            " Young plants must be kept weed " +
                            "free for the first 45 days of growth, and so weeding should be repeated as many times as " +
                            "is necessary to keep the crop weed free for this period. Late weeding is also recommended so " +
                            "that the crop is weed free at the time of harvesting. Appropriate use of herbicides will ensure " +
                            "a weed free crop. Use of pre-emergence herbicides like atrazine recommended in soils with greater" +
                            " than 25% clay content.",
                    "Warnings of imminent outbreaks are usually broadcast in the media. If such warnings are" +
                            " received, " +"or even as a regular precautionary measure, scout the crop for the appearance of pests " +
                            "in December/January -Chemical control is possible with carbaryl, endosulfan, malathion and " +
                            "trichlorfon. Digging a shallow trench ahead of marching caterpillars will slow them down and " +
                            "concentrate them in an area where they can be physically destroyed. ",R.drawable.pearlmillet),
            new Crop("Sorghum",
                    " Land preparation should begin just after harvesting the preceding crop. " +
                            "Can use Conventional Tillage - Using the conventional plough turn the soil, burying all " +
                            "crop residues and weeds. Ploughing should always be done across the slope and ensure weed " +
                            "free field. OR Reduced tillage - No ploughing. Only create planting stations for seeds ensure " +
                            "weed free field. If using reduced tillage. Dig basins (15cm long, 15cm wide & 15cm deep) at a " +
                            "spacing of 75 cm inter-row and 40 cm in-row if using basin method. OR Open planting on lines on " +
                            "unploughed land using a ripper tine at 75cm between rows. If using Conventional tillage. If the " +
                            "land has many clods, an ox-drawn harrow can be used to break the clods and create a fine tilth. Open " +
                            "planting lines at 75cm apart.",
                    "The best time for planting is as soon as the first effective rains (when there is enough moisture in the" +
                            " soil for seed germination) have been received. If using Basin Method - Plant 5 pips per basin. " +
                            "Cover the seeds with 2-3 cm of clod-free soil. If using Ripper-tine method, Drill the seed thinly" +
                            " in the planting furrow so that individual seeds are 10-15 cm. Cover the seeds with 2-3 cm of " +
                            "clod-free soil. Seeds can also be drilled using a direct seeder calibrated for the particular " +
                            "crop. If using the conventional method, Drill the seed thinly in the planting furrow so that" +
                            " individual seeds are 10-15 cm. Cover the seeds with 2-3 cm of clod-free soil. Seeds can also be" +
                            " drilled using a direct seeder calibrated for the particular crop.",
                    "Thinning is very important to ensure the optimal plant population. A plant population that is " +
                            "higher than optimal will result in tall and thin plants that will produce very small heads, " +
                            "resulting in reduced yields. The first weeding should be done as soon as weeds start to emerge. " +
                            "Young plants must be kept " +
                            "weed free for the first 45 days of growth, and so weeding should be repeated as many " +
                            "times as is necessary to keep the crop weed free for this period. Late weeding is" +
                            " also recommended so that the crop is weed free at the time of harvesting. Appropriate use " +
                            "of herbicides will ensure a weed free crop. Use of pre-emergence herbicides like atrazine " +
                            "recommended in soils with greater than 25% clay content.",
                    "Warnings of imminent outbreaks are usually broadcast in the media. If such warnings " +
                            "are received, or even as a regular precautionary measure, scout the crop for the appearance of" +
                            " pests in December/January -Chemical control is possible with carbaryl, endosulfan, malathion " +
                            "and trichlorfon. Digging a shallow trench ahead of marching caterpillars will slow them down and" +
                            " concentrate them in an area where they can be physically destroyed. ",
                    R.drawable.sorghum),
            new Crop("Tobacco",
                    "A deep plough and good land preparation are essential for maximum yield and quality. As a" +
                            " rule, a plough should never be less than 23cms. Another popular method is “rip and rhome” which " +
                            "is also done early in the year followed by further discing to keep the land free of weeds.",
                    "To plant:\n" +
                            "The tobacco seed is very small, so it must be started indoors. To germinate, it requires a temperature of" +
                            " at least 65 degrees. Begin the seed in seed compost and not potting mix six weeks before the last frost." +
                            " When planting, place the seed on top of the compost and do not cover it. In addition to warmer temps, " +
                            "it also requires light to germinate. Mist the seeds with a mister water bottle.\n" +
                            "\n" +
                            "To grow:\n" +
                            "Seedlings are ready to be transplanted once they reach 8 inches in height. " +
                            "Transplant them after all dangers of frost have passed To grow its broad leaves, " +
                            "tobacco plants require full sun. If it grows partial sun, its leaves will be skinny." +
                            " Tobacco prefers soil with a pH of 5.8 and well-drained soils. Space the transplants 2" +
                            " feet apart from each other in rows set 3 feet apart. \n" +
                            "\n" +
                            "Transplant them in the evening to prevent the plants from drying out and water thoroughly" +
                            " after transplanting. Once transplanted, water the tobacco plant daily until it becomes established. " +
                            "Once flowers and suckers appear on the plant, remove them to encourage more growth in the tobacco leaves." +
                            "To harvest:\n" +
                            "Tobacco plants can be harvested by cutting down the entire plant at once or by pulling individual" +
                            " leaves from the plant. Tobacco leaves are ready to harvest from the ground up. Once harvested, the" +
                            " leaves are dried through a process called curing. Curing can be down by air, where it is hung in a" +
                            " barn, or two other ways — flue-cured tobacco and sun-cured tobacco.\n" +
                            "\n" +
                            "To make flue-cured tobacco, the leaves are added to tobacco sticks which are then hung in a barn’s " +
                            "kiln, which will heat cure the tobacco but not expose it to smoke. To sun cure tobacco, the leaves are " +
                            "placed in the sun and dried.\n" +
                            "\n" +
                            "What tobacco craves:\n" +
                            "To fertilize tobacco" +
                            ", use the same fertilizers used for tomatoes or peppers. Fertilizer should" +
                            " contain no chlorine and its nitrogen should be in nitrate form. Apply the fertilizer " +
                            "over several separate instance, such as applying it to the soil before transplanting " +
                            "and continuously throughout the tobacco’s growing season to keep the leaves a solid green " +
                            "color. Once flowers begin to form, stop the fertilization process.",
                            " Drilled using a direct seeder calibrated for the particular crop."+
                            "CLIMATIC CONDITIONS REQUIRED\n" +
                            "Climatic requirements Temperature Tobacco is tropical in origin, but it is grown successfully " +
                            "under tropical, subtropical and temperate climates. Normally, it requires about 100 to 120 days," +
                            "frost-free climate with an average temperature of 20 °C to 30 °C between transplanting and harvesting." +
                            "In general, the tobacco plant is remarkably sensitive to the environment. Ideal conditions required " +
                            "for successful production of high-quality leaves are liberal and well-distributed rainfall during" +
                            " active vegetative growth stage, long day lengths, and mean temperature of 26 °C during the growing season" +
                            " and lastly, a relatively high humidity of 70–80%. Rainfall Tobacco requires an annual rainfall distribution" +
                            "of between 500 to 1,250 mm. However, excess water may result in the plant becoming thin and flaky. Therefore, " +
                            "tobacco should be ripening without heavy rainfall.\n" +
                            "SOIL SAMPLING\n" +
                            "Soil requirements Tobacco can be grown in almost every type of soil. However, best soils for tobacco" +
                            " production are deep, well-drained loamy soils with little or no risk of flooding. Despite tobacco" +
                            "being somewhat tolerant to drought, optimum production is achieved from soils with high water-supply" +
                            " capacity. Soils with the rooting depth of at least 76,2 centimetres are preferred. Production has" +
                            " also been quite successful on soils with well-structured red clay sub-soils. Soils with tight, " +
                            "heavy clay sub-soils, very sandy and soils with rooting depth less than 76,2 centimetres should be " +
                            "avoided. Soils with clayey surfaces that tend to be cloddy when tilled may cause problems with" +
                            " transplant survival. Because of sensitivity to wet soils, tobacco should not be grown in fields " +
                            "that pond or flood in heavy rains. The optimum soil pH for tobacco production is about 5 to 6,5.\n" +
                            "\n" +
                            "SOIL PREPARATION\n" +
                            "The area or plots in which tobacco transplants are to be transplanted should be constantly exposed " +
                            "to the sun, well-drained and tilled. Soils, proven to have diseases and nematodes infestation should be avoided.\n" +
                            "\n" +
                            "PLANTING AND TRANSPLANTING\n" +
                            "The ideal time for planting is autumn (from February to April) under irrigation conditions, " +
                            "when adequate moisture is present, and a full summer is ahead for a quick canopy and optimum " +
                            "use of summer conditions. Under rain-fed conditions planting should be done from April to May." +
                            " In the Midlands, planting should not go beyond October, as the vector for mosaic is active thereafter" +
                            " and rapid spread of the diseases may occur. Autumn planting is possible, but conditions must be favourable" +
                            " for germination before winter. The" +
                            " seeds are sprinkled onto the surface of a sterile seed starter mix that is slightly watered. Starter mix is" +
                            " placed in a smaller flower pot, preferably with holes in the bottom. Seeds are grown indoors for a period of" +
                            " 4 to 6 weeks. Tobacco seeds are extremely small (not much larger than a pinprick), so they should not be sown " +
                            "too thickly. There should be adequate spacing between the seeds to avoid overcrowding. Tobacco seeds should be" +
                            " planted outdoors with warm temperature of about 24 °C to 27 °C for proper germination. Seeds should not be " +
                            "covered with soil since they need light to enhance germination; tobacco seed takes about 7–10 days to germinate." +
                            "Tobacco seedlings can be transplanted after 3–4 weeks. Transplanting tobacco plant bare-root (without soil) directly" +
                            " from the seedling pot to the land is an easier method, as it only involves one transplant. However, once the" +
                            " seedlings are planted into the soil they can go into a transplant shock. Transplant shock result in leaves turning " +
                            "yellow and wilting. After a week, tobacco plant will begin to flourish again, especially if transplanting shock is avoided. " +
                            "Seedlings should be watered with plant starter fertiliser solution like Miracle-Gro or seaweed/fish emulsion fertiliser." +
                            " If the plant begins to look yellow or stunted, another dose of fertiliser mix should be added. The plants should be at" +
                            " least 60,96 cm apart and distance between the rows should be 91,44 cm from each other.\n" +
                            "FERTILISATION\n" +
                            "As a guide to the fertiliser requirement of tobacco, much emphasis should be placed on the " +
                            "nutrients uptake of a plant throughout the season. In particular, the amount of Potassium (K)" +
                            " taken up by the plant is very low in relation to the amounts typically applied. A large part of " +
                            "the applied nutrients remain in the soil when the crop is removed. The soil test is a valuable " +
                            "diagnostic tool for monitoring soil nutrient status and fertiliser requirement of tobacco. " +
                            "A soil test is helpful in determining the pH and availability of nutrients. A total fertiliser" +
                            " programme involves more than adding the recommended lime and nutrients. Careful consideration should" +
                            " be paid to residual nitrogen (N) leaching, placement and timing of nutrient applications. Over-fertilisation " +
                            "with N and certain micronutrients can decrease yield and quality of tobacco, increase production costs, and " +
                            "may adversely affect water quality.\n" +
                            "Liming (pH, Calcium (Ca) and Magnesium (Mg) The optimum pH for tobacco production is 5,7 to 6,0, although" +
                            "good growth can be obtained at higher and lower values depending on soil type. Dolomitic lime containing both" +
                            " Ca and Mg is recommended.\n" +
                            "Nitrogen (N) Nitrogen management affects yield and quality of tobacco more than any other nutrient. When plants " +
                            "suffer from nitrogen deficiency, yield will be reduced and cured leaves tend to be pale and slick with poor " +
                            "texture. While excessive N may slightly increase yields, it also stimulates excessive suckering, delays " +
                            "maturity, and may result in dark coloured, unripe cured leaf.\n" +
                            "Nitrogen, (N), Phosphorous (P) and Potassium (K) The most common grades of fertiliser have either a " +
                            "1:0:3, 1:1:3, 1:2:3 or 1:3:3 ratio. With proper selection of the fertiliser ratio, the proper P rate can " +
                            "be applied without altering the rates of N and K. Secondary nutrients The secondary nutrients (Ca, Mg, and S) " +
                            "are often included in complete tobacco fertilisers. They may also be added using other readily available nutrient " +
                            "sources such as dolomitic lime (Ca, Mg), gypsum (Ca, S), and Potassium Magnesium Sulphate (K, Mg, S).\n" +
                            "\n" +
                            "IRRIGATION\n" +
                            "Irrigation is an important aspect in the production of good quality tobacco. Rainfall is unpredictable and generally " +
                            "unreliable during the critical growth period. Therefore, irrigation is typically used to supplement water needs during" +
                            "the periods where there is no rainfall. Too often, water is applied in a haphazard manner with little regard to the water " +
                            "needs of the crop. Research has indicated that under watering as well as overwatering can significantly reduce both yield " +
                            "and quality of tobacco. It is important to apply the appropriate amount of water at the proper times.. Under conditions of" +
                            " inadequate soil moisture, tobacco can benefit from timely application of water in amounts to bring the soil moisture " +
                            "level up to or close to field capacity. Over application of irrigation should be avoided because of the wasteful nature " +
                            "of the use of excessive water and the possibility of negatively affecting yield and quality of the cured leaf by causing " +
                            "damage to the root system or leaching needed nutrients below the root zone and out of reach of the roots.\n"+
                            "WEED CONTROL\n" +
                            "Weed control is one of the most important aspects in the production practice of tobacco. Weeds compete with the plant " +
                            "for moisture and nutrients which may result in yield losses. In addition to reduced yields, weeds may also be a serious " +
                            "source of foreign material in mechanically harvested tobacco. Good weed control in tobacco is best achieved by utilising" +
                            " all available methods of weed control in an integrated programme which includes the following:\n" +
                            "Sanitation Many of the problem weeds in tobacco are the result of seed produced in the field during the preceding crops " +
                            "or seed blown into the field or onto plant beds from adjacent areas such as fence rows or ditch banks. Preventing weeds " +
                            "from producing seed in these areas may aid in reducing weed problems in succeeding tobacco crops. Destroying weeds" +
                            "around the plant bed area, as well as utilising natural or artificial windbreaks, will reduce weed problems.\n" +
                            "Crop rotation Crop rotation can be beneficial in reduction of weed problems. Many weeds, especially the large-seeded " +
                            "broadleaf weeds such as sicklepod, cocklebur, and Florida beggarweed, can be more effectively controlled in other crops " +
                            "such as maize or sorghum. Controlling these weeds in a rotational crop reduces the weed seed available for germination " +
                            "in the tobacco crop.\n" +
                            "Cultivation Cultivation and occasional hand-hoeing have, and continue to be, an important part of a tobacco weed " +
                            "control programme. Currently, there are several weeds in tobacco that can be effectively controlled only by this " +
                            "method.\n" +
                            "Chemical control The use of herbicides in tobacco has become widely used in the control of weed. Good early-season" +
                            " weed control with herbicides can be extremely important in reducing competition and allowing the rapid establishment" +
                            " of tobacco, resulting in more effective cultivation. Labour requirements for hand hoeing and cultivation can be " +
                            "reduced by proper use of herbicides. Herbicides may supply some insurance against fields becoming weedy during wet" +
                            " periods following transplanting. All weeds do not respond the same to all herbicides; therefore, the weeds expected " +
                            "in the field should be known when planning a weed control program.\n" ,
                            "\n" +
                            "DISEASE CONTROL\n" +
                            "PEST CONTROL\n" +
                            "There are several species of insects that poses serious threats to tobacco in the field, greenhouses, and the curing " +
                            "barn. Insects damages the roots, destroy the leaves and buds, reduce leaf quality, and transmit several important tobacco diseases. The integrated pest management (IPM) system is important in combining cultural, natural, and chemical controls in order to maintain insect pest population and promote the use of insecticides only when necessary.\n" +
                            "HARVESTING\n" +
                            "Tobacco should only be harvested when it has reached its maturity and it has ripened. Burley tobacco usually matures " +
                            "and is ready for harvest 3 to 5 weeks after topping, at which time the upper third part of the plant should have a " +
                            "distinct pale green to yellow appearance, and the bottom part of the plant is completely yellow. The midribs of the" +
                            " leaves should fade from a green colour to a pale yellow colour as the plant ripens. Different varieties of tobacco " +
                            "differ in the time of maturity or ripening. However, added growth and weight of the upper leaves will usually more " +
                            "than make up for the loss of down-stalk leaves.\n" +
                            "Harvesting methods\n" +
                            "Tobacco is generally harvested in one of two ways. The oldest known method in use is simply cutting off the stalk " +
                            "at the ground using a curved knife. They start to harvest the tobacco plant by pulling individual leaves off the " +
                            "stalk as they ripen; tobacco leaves ripen from the ground upward, so the tobacco plant may be pulled several different" +
                            " times before the tobacco plant is entirely harvested. This is also known as “Cropping” or “Priming.’’ These are" +
                            " terms used for pulling leaves off tobacco. The first crop at the very bottom of the stalks are called “sand lugs” " +
                            "as they are often against the ground and are coated with dirt splashed up when it rains.\n" +
                            "CURING\n" +
                            "After tobacco has been harvested, it is necessary to cure it before consumption. Tobacco curing is also known as" +
                            "colour curing because when tobacco leaves are cured, the intention is to change their colour and reduce their " +
                            "chlorophyll content. Curing of tobacco is not a simple drying process but involves a series of physical and " +
                            "chemical changes that begin when the plant is cut and ends when the plant is dry. The major steps in the curing " +
                            "process include wilting, yellowing, browning or colouring and drying. The entire process requires six to eight weeks." +
                            "Optimum curing conditions occur when temperature is in the general range of 17 °C to 32 °C and relative humidity is 70–75%." +
                            " In the early stages of curing, it is impractical to attempt to maintain these optimum ranges through a period of 24 " +
                            "hours. In normal weather, the humidity within a barn filled with green tobacco will approach 100% each night. A good" +
                            " cure can still be obtained if ventilation is provided to dry out the barn the next day. Curing methods vary with the " +
                            "type of tobacco grown, and tobacco barn design varies accordingly:\n" +
                            "Air\n" +
                            "Air-cured tobacco is hung in well-ventilated barns and allowed to dry over a period of four to eight weeks. Air cured " +
                            "tobacco is low in sugar, which gives the tobacco smoke a light, sweet flavour, and high nicotine content. Cigar and burley" +
                            " tobaccos are air cured.\n" +
                            "Fire\n" +
                            "Fire-cured tobacco is hung in large barns where fires of hardwoods are kept on continuous or intermittent low smoulder " +
                            "and takes between three days and ten weeks, depending on the process and the tobacco. Fire curing produces a tobacco" +
                            " low in sugar and high in nicotine. Pipe tobacco, chewing tobacco, and snuff are fire cured.\n" +
                            "Flue\n" +
                            " Flue-cured tobacco was originally strung onto tobacco sticks, which were hung from tier poles in curing barns. These" +
                            " barns have flues which run from externally fed fire boxes, heat-curing the tobacco without exposing it to smoke, slowly" +
                            " raising the temperature over the course of the curing. The process will generally take about a week. This method " +
                            "produces cigarette tobacco that is high in sugar and has medium to high levels of nicotine. The Smith Tobacco Barn is " +
                            "an example of a traditional, flue-cured tobacco barn.\n" +
                            "Sun\n" +
                            "Sun-cured tobacco dries uncovered in the sun. This method is used in Turkey, Greece, Bulgaria, Macedonia, Romania and " +
                            "Mediterranean countries to produce oriental tobacco. Sun-cured tobacco is low in sugar and nicotine and is used in " +
                            "cigarettes. In India sun curing is used to produce socalled “white” snuffs, which are fine, dry, and unusually potent.\n" +
                            "GRADING\n" +
                            "Stripping the leaves from the stalk and sorting into groups enables leaf buyers to obtain the specific grades needed" +
                            " by the manufacturer. If tobacco leaves are not properly separated by stalk position, quality is sacrificed and the overall " +
                            "sustainability tobacco" +
                            " production is weakened. Generally there are four distinguishable grades of tobacco on a stalk. These grades include Flyings (X)," +
                            "Lugs (C), Leaf (B), and Tips (T). The flying group (X) consists of leaves grown at the bottom of the stalk. These leaves are " +
                            "flat and have a blunt of oblate tip. They are relatively thin bodied and show a certain amount of injury. The lug group (C) " +
                            "consists of leaves which grow above the flyings and up to about midportion of the stalk. These leaves have a rounded tip and, " +
                            "when cured, have a tendency to fold and conceal the midrib. They are thin to medium bodied. The leaf group (B) is made up of " +
                            "leaves grown above the lugs. The cured leaves, especially from the upper stalk position, have a tendency to fold and conceal " +
                            "the face of the leaf. These leaves are medium to heavy bodied. The tips (T) are those top 3 or 4 leaves at the top of the stalk"+
                    "There are several species of insects that poses serious threats to tobacco in the field, greenhouses, and the curing barn. " +
                            "Insects damages the roots, destroy the leaves and buds, reduce leaf quality, and transmit several important tobacco diseases. The " +
                                    "integrated pest management (IPM) system is important in combining cultural, natural, and chemical controls in order to " +
                                    "maintain insect pest population and promote the use of insecticides only when necessary.\n" +
                            "1.TOBACCO BUDWORMS (HELIOTHIS VIRESCENS) Description: Tobacco budworm moths are light olive to brownish-olive, with a wingspan" +
                                    " of about 32 mm. Each forewing bears three slanted, dark olive or brown bands. Hind wings are white with dark margins." +
                                    " Damage: Tobacco budworms feed in the buds of young tobacco plants causing many holes in the tiny developing leaves." +
                                    " As the leaves grow, these feeding holes become larger and give the plants a ragged, distorted appearance. However," +
                                    " budworms sometimes top the plants prematurely; causing early sucker growth that may stunt the plants and require extra " +
                                    "labour to remove the suckers. After the button stage, budworms rarely cause eco nomic damage. Control: Foliar sprays for" +
                                    " budworm control with one or three solid-cone or hollow-cone nozzles can be used.\n" +
                            "\n" +
                            "2. TOBACCO HORNWORMS (MANDUCA SEXTA)\n" +
                            "Description: Tobacco hornworms are large caterpillars (up to 10,16 cm long).\n" +
                            "Damage: Tobacco hornworms eat large amounts of tobacco leaf. Infestations may develop anytime from transplanting until harvest," +
                                    " but damage is usually most severe during August and Sep tember.\n" +
                            "Control: Early topping, early trans planting, effective sucker control, and fertilisation with recommended rates of nitrogen" +
                                    " help reduce late-season infestations. On a large space, stalk cutting and root destruction immediately after harvest " +
                                    "reduce overwintering hornworm populations.\n" +
                            "3. Aphids\n" +
                            "Description: Tobacco aphid is the most severe pest for tobacco. Their population increases rapidly, doubling in size in about " +
                                    "every two days under favourable conditions. High popu lations of aphids can reduce tobacco yield by 5–25% or more. " +
                                    "Aphids are tiny true bugs with piercing, sucking mouthparts designed to suck the juices from plants. They are usually " +
                                    "wingless and pear-shaped. They can be recognised by the pair of cornicles projecting from their hind ends—two " +
                                    "tiny “tailpipes” that other soft-bodied insects lack. They vary in colour according to species and host plants. Tobacco " +
                                    "aphid is the most severe pest for tobacco. Their population increases rapidly, doubling in size in about every two days " +
                                    "under favourable conditions. High populations of aphids can reduce tobacco yield by 5-25% or more.\n" +
                            "Damage: As aphids feed, they excrete honeydew that contains the excess sugars obtained from the plant sap. This sticky, shiny" +
                                    " honeydew and tiny white exoskeletons are deposited on the leaves below the feeding aphids. A dark, sooty mold that gives " +
                                    "the leaves a dark tint often grows on the honeydew. The combination of sooty mold and honeydew interferes with curing, reduces" +
                                    " leaf quality, and often remains on tobacco after aphids have been controlled. Aphids are most severe on field tobacco from late" +
                                    " June to September.\n" +
                            "Control: Remedial applications of a foliar insecticide at the economic threshold level before populations become too high should be" +
                                    " applied. Rotating insecticides with different modes of action reduces the chances that resistance will develop. When applying " +
                                    "several insecticides for aphid control over the growing season, change from one group to another. It takes one to three days" +
                                    " after application of most insecticides for the aphids to die.\n" +
                            "4. Tobacco Flea Beetle (Epitrix hiritipennis)\n" +
                            "Description: Tobacco Flea Beetle is a hard-shelled, black, very active beetle about 1,5 mm long. Wing covers have rows of" +
                                    " fine distinct punctures. The eyes are black and the antennae 12-segmented. Damage: Tobacco Flea Beetles feed on" +
                                    " the leaves and stalks of tobacco, while the grubs or larvae feed on tobacco roots. Extensive feeding in both beetle" +
                                    " stages on newly set transplants may cause stunting and uneven stands. When checking tobacco fields for Flea Beetles, " +
                                    "look for the characteristic shot-hole feeding damage, and then count the beetles on 20 plants (two per field-sample " +
                                    "location)\n" +
                            "Control: Treatments for Flea Beetles on newly set tobacco should be applied when there are four or more beetles per plant. " +
                                    "Larger plants can tolerate very high Flea Beetle densities. An insecticide should be applied when the base of the lower " +
                                    "leaves have a netted appearance or densities exceed 60 beetles per plant. The most effective cultural practices for" +
                                    " reducing Flea Beetle damage are harvesting at the normal time and stalk cutting and root destruction immediately after" +
                                    " the last harvest. Tobacco with nitrogen deficiency appears to be more susceptible to Flea Beetle damage after topping. " +
                                    "Flea Beetles are difficult to control after topping because the insecticides that can be used at this time provide only " +
                                    "short residual control and Flea Beetles are emerging from the soil over an extended period.\n" +
                            "5. Tobacco splitworm\n" +
                            " Description: " +
                                    "The tobacco splitworm, or potato tuberworm, is a leaf-mining caterpillar that is sometimes a late-season problem " +
                                    "on tobacco.\n" +
                            " Damage:" +
                                    " Splitworms live in tunnels or mines that appear as greyish, translucent blotches on the leaves. Splitworms " +
                                    "can also feed in the midvein and stalk. Old mines turn brown and brittle and may destroy over 50% of the leaf. " +
                                    "Although the mines are most common on the lower leaves, they can occur on any leaf. Splitworm damage increases " +
                                    "the amount of dead leaf tissue and may reduce crop yield and value.\n" +
                            " Control:" +
                                    " Since splitworms feed within the leaves, they are difficult to control with insecticides. " +
                                    "Currently, no insecticides are registered for splitworm control on tobacco. Therefore, it is important" +
                                    " to avoid planting or storing Irish potatoes near tobacco fields because they are an important source of " +
                                    "this pest. If splitworm mines are observed on the lower leaves, the leaves should be harvested and cured as" +
                                    " soon as possible. Since splitworms continue to develop inside the leaves after they are harvested, removing " +
                                    "infested leaves and dropping them on the ground will not reduce the problem and may make it worse.\n" +
                            "6. Nematodes\n" +
                            "Damage:" +
                                    " Plant parasitic nematodes can be found wherever tobacco is grown. The severity of the damage they " +
                                    "cause may depend on climate and soil type. Damage caused by nematodes are difficult to estimate because" +
                                    " damage to roots may not be apparent in above ground symptoms, yet significant reductions in yields can occur " +
                                    "with moderate levels of nematodes. Nematodes may increase the incidence of other diseases such as black shank, " +
                                    "bacterial wilt and Fusarium wilt. The most important nematodes on tobacco are the root-knot nematodes. The most " +
                                    "prevalent is the southern root-knot nematode, Meloidogyne incognita. However, another species (M. arenaria) also " +
                                    "infests some fields. Meloidogyne arenaria (sometimes called peanut root-knot) is important because it is very " +
                                    "damaging to tobacco and there is presently no resistance to this pest. Varieties that are resistant to the southern " +
                                    "root-knot (M. incognita) are not resistant to M. arenaria.\n" +
                            " Control: " +
                                    "Rotation is effective for both root-knot species and again should provide the basis for management of " +
                                    "nematodes. Nematicides may also be effective in reducing nematode numbers in soil. It is best to base the " +
                                    "control strategy on rotation, using resistant varieties when appropriate and nematicide treatments to supplement" +
                                    " the rotation strategy. If rotation cannot be practiced, or only short rotations (1 year) are utilised, the" +
                                    " use of nematicides and resistance becomes essential. Combining rotation, resistant varieties, and nematicides " +
                                    "or fumigants are the best control practices.\n" +
                            "DISEASE CONTROL\n" +
                            "1. Granville wilt\n" +
                            " Granville wilt is caused by bacterium (Pseudomonas solanacearum). The disease is most damaging in fields where tobacco " +
                                    "has been grown the previous year and in wet areas of fields.\n" +
                            "Symptoms: The plant begins to wilt and eventually dies off. If the plant does not die off, growth is usually stunted " +
                                    "with twisted and distorted leaves. The stalk of the plant turns black, especially at the soil line\n" +
                            "Control:" +
                                    " One of the most important management strategies for Granville wilt is crop rotation because the bacteria that " +
                                    "cause the disease do not survive well in the absence of the tobacco host plant. Planting of resistant varieties.\n" +
                            "\n" +
                            "2. Alternaria leaf spot (Brown spot)\n" +
                            "Alternaria leaf spot (Brown spot) is a fungal disease caused by (Alternaria alternate). Disease emergence favors " +
                                    "warm, wet weather and excessive fertilisation can cause greater crop losses.\n" +
                            "Symptoms:" +
                                    " Small, circular, target-like spots on lower leaves. Lesions are usually surrounded by a bright yellow " +
                                    "halo and enlarged. When variety of tobacco being grown is susceptible to the disease, then spots may also" +
                                    " appear on stalks and suckers.\n" +
                            "Control: Rotating crop away from tobacco can help to reduce the levels of inoculums in a field. Stalks and roots" +
                                    " left after harvest should be removed and destroyed. Nematodes in the soils should be controlled. Ensure " +
                                    "plants have adequate potassium available to promote vigorous growth.\n" +
                            "\n" +
                            "3. Collar rot Collar\n" +
                            "rot is a fungal disease caused by (Sclerotinia sclerotiorum). It causes a serious problem of glasshouse grown tobacco plants.\n" +
                            "Symptoms:" +
                                    " Water-soaked, soft, green, lesion at base of stem. Black fungal structures develop out of the white fungal growth.\n" +
                            " Control:" +
                                    " Reduce build-up of moisture in glasshouses by increasing ventilation and air circulation. Increase frequency of " +
                                    "leaf clipping and reduce the amount of leaves removed at each clipping. Avoid injuries to the seedlings.\n" +
                            "\n" +
                            "4. Fusarium wilt\n" +
                            "Fusarium wiltanae is not common but can cause damage where it occurs.\n" +
                            " Symptoms: " +
                                    " Symptoms usually develop on one side of the plant with distinctive leaf yellowing and drying.  The outer bark peels" +
                                    " off, revealing a brown to black discoloration in the woody stem cylinder.\n" +
                            " Control:  Infested side should be abandoned. Crop rotations with forage grasses or small grains are recommended. Treatment " +
                                    "with multipurpose fumigants and resistant varieties are recommended.\n" +
                            "\n" +
                            "5. Black shank\n" +
                            "Black shank is caused by the fungus Phytophthora parasitica var. nicotianae. It is favoured by wet spring weather.\n" +
                            "Symptoms: " +
                                    " Typically, black shank results in extensive root rotting, pith disking and decomposition, and blackening on the " +
                                    "outer surface of the stalk.\n" +
                            " Control: " +
                                    " Resistant cultivars should be planted. Crop rotation\n" +
                            "\n" +
                            "6. Tobacco mosaic virus (TMV)\n" +
                            "Tobacco mosaic virus is a viral disease. It can be spread by farming equipment and by hands that have come into " +
                                    "contact with cigarettes or other tobacco products.\n" +
                            " Symptoms: " +
                                    "Alternating light and dark green patches appears on the leaves. Leaves turn brown and dry out.\n" +
                            " Control: " +
                                    "Tobacco resistant varieties should be planted. Infected plants should be removed and destroyed. " +
                                    "Hands should be washed thoroughly after use of tobacco products before handling plants; avoid having " +
                                    "tobacco products on person when working with tobacco plants.",
                    R.drawable.tobacco1),
            new Crop("Cotton",
                    "How can we prepare land for cotton cultivation?\n" +
                            "Land preparation\n" +
                            "\n" +
                            "Cotton is sown on ridges and furrows. For irrigated cotton the land " +
                            "is given a deep ploughing followed by two harrowings. Ridges and " +
                            "furrows having different spacing for irrigated and rainfed cotton. " +
                            "For irrigated cotton shallow ridges on 90cm spacing should be prepared" +
                            " which helps in irrigation.",
                    "Growers check the soil temperature regularly before planting. Cotton seed " +
                            "is planted in the spring, as soon as the soil is warm enough to be sure of " +
                            "satisfactory seed germination and crop establishment (when the temperature " +
                            "reaches 14 degrees Celsius measured at 8am AEST with a rising temperature " +
                            "forecast for the seven day period post-planting).\n" +
                            "\n" +
                            "Cotton seeds emerge from the ground five to 14 days after planting - " +
                            "depending on soil temperature and moisture.\n" +
                            "\n" +
                            "Refuge crops are also established at this time, which help slow down resistance" +
                            " to Bt proteins from evolving in the pest population by producing susceptible " +
                            "Helicoverpa moths that have not been exposed to the Bt toxins. Moths produced " +
                            "in the refuge crops will disperse and mate with any potentially resistant moths " +
                            "from the Bollgard 3 crops. This tactic is called genetic dilution.",
                    "Some important steps to take at this early and critical stage in the season would include: " +
                            "1) identifying the average FFB for a field; and " +
                            "2) making note of the overall fruit retention (FR) level." +
                            " Identification of the FFB requires a careful inspection of a young plant using the following points: " +
                            "1) the cotyledon nodes (parallel nodes at the base of the plant) = 0; " +
                            "2) the FFB is usually not found before node number 5," +
                            " but in some cases it can be as low as node number 4; " +
                            "3) FFB occurrence on nodes 5,6, or 7 is a normal or optimal point of transition; " +
                            "and 4) FFB above node 7 is an early indication of a delay in fruiting," +
                            " potential for vegetative growth, and a potential for loss of crop earliness potential. " +
                            "Differentiating between a vegetative and fruiting branch can be done by looking at the first node " +
                            "(bump) on the branch in question. If the branch is a fruiting branch it will have either a viable " +
                            "fruit (square, bloom, or boll) or an abortion scar. If the branch is smooth at the first" +
                            " node (no fruit and no scar), it is a vegetative branch. Vegetative branches also have a tendency " +
                            "to have a straight growth pattern, whereas, fruiting branches have more of a zig-zag growth pattern " +
                            "with slight bends at each node.\n" +
                            "\n" +
                            "Estimating FR levels can be done relatively easily this time of year. Once the FFB is identified," +
                            " one can simply progress up the plant, one fruiting branch at a time, and identify the number " +
                            "of aborted or retained fruiting forms on each branch. After a field has begun to bloom we then take" +
                            " into account both the first and second positions on each branch for estimating FR. " +
                            "For example, if a field was in a pre-bloom stage of growth, we could evaluate the first position" +
                            " squares and calculate %FR in the following manner: 1) identify FFB at node 6 " +
                            "(therefore, there are 5 vegetative branches); 2) if the node in the terminal has an attached " +
                            "leaf that is 1 inch in diameter or greater, then we count it ; we can then count aborted or " +
                            "retained sites from the FFB to the top node (suppose the first position had an abortion scar on " +
                            "branch 6, therefore 1 aborted and 2 retained sites); divide the number of retained sites by the " +
                            "total number of sites counted ([2 retained sites ¸ 3 total sites counted] X 100 = 66% fruit retention). " +
                            "The average %FR taken from a given field can then be compared to the baseline for FR developed here in Arizona " +
                            "to gauge crop condition at this time.\n" +
                            "\n" +
                            "If FR is dropping in a field, management steps to consider should include: maintain good plant-water " +
                            "conditions (don’t stress to try to encourage fruiting but don’t over-water either); be cautious with" +
                            " N fertilization (check N fertilization records and petiole NO3--N concentrations); check for insect " +
                            "pest infestations; and watch for vegetative growth tendencies, which may require a plant growth regulator application.\n" +
                            "\n" +
                            "It is important to evaluate crop condition early in the season. For example, we also don’t want to go " +
                            "out into a field in August and realize we have a problem that may have begun back in May.",
                    "Use tolerant varieties. Trap cropping with crops like tomato, and destroying them when the population is high." +
                            " Use of maize and cowpea on borders and wild brinjal and setaria as intercrop significantly helps in reducing " +
                            "the pest population",
                    R.drawable.maize),
            new Crop("Sugarcane",
                    "Sugarcane stands in the field for more than one year hence, land is prepared by giving two deep ploughing.\n" +
                            "First ploughing is given immediately after the harvesting of previous crop with mould board plough or tractor.\n" +
                            "The land is exposed to sun for one to two months.",
                    "How do you plant sugar cane?\n" +
                            "Sugar cane stems are planted horizontally on their sides, in four-inch deep furrows, or trenches. They need " +
                            "full sun, so choose an area that isn't shaded. Dig furrows long enough to fit each piece of cane you're planting," +
                            " and space the furrows one foot apart. Seed cane is planted in well-worked fields. Mechanical planters that open the " +
                            "furrow, fertilize, drop the seed cane, and cover it with soil are widely used. ",
                    "Most diseases of sugarcane are not managed by crop protection products alone. Instead they are managed using " +
                            "a combination of hygiene practices, variety selection, fallow management, and the use of " +
                            "clean propagation material of recommended varieties",
                    "Phorate has consistently been the most effective insecticide in UF/IFAS trials for wireworm control in sugarcane " +
                            "produced on organic soils. Results of UF/IFAS trials suggest that pyrethroid and neonicotinoid" +
                            " insecticides may also protect sugarcane from wireworm injury.",
                    R.drawable.maize)
    };

    //Each crop has name, land_preparation, planting, crop_management, pest_management and an image resource
    private Crop(String crop_name, String land_preparation, String planting, String crop_management, String pest_management,int imageResourceId){
        this.crop_name = crop_name;
        this.land_preparation = land_preparation;
        this.planting = planting;
        this.crop_management = crop_management;
        this.pest_management = pest_management;
        this.imageResourceId = imageResourceId;
    }

    public String getCrop_name(){
        return crop_name;
    }

    public String getLand_preparation(){
        return land_preparation;
    }

    public String getPlanting(){
        return planting;
    }

    public String getCrop_management(){
        return crop_management;
    }

    public String getPest_management() {
        return pest_management;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString(){
        return this.crop_name;
    }
}
