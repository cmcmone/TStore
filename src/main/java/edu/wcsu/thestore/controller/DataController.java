package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.Product;
import edu.wcsu.thestore.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Controller
public class DataController {
    @Autowired
    private ProductsService productsService;

    @RequestMapping(value = {"/data", "/test"})
    public String addTestData() {
        List<Product> products = new ArrayList<Product>() {{
            add(new Product(0,
                    "New Apple iPhone 14 (64GB, Black) [Locked] + Carrier Subscription",
                    100,
                    "OFFER INCLUDES: An Apple iPhone and a wireless plan with unlimited data/talk/text\n" +
                    "WIRELESS PLAN: Unlimited talk, text, and data with mobile hotspot, nationwide coverage, and international reach. No long-term contract required.\n" +
                    "PROGRAM DETAILS: When you add this offer to cart, it will reflect 3 items: the iPhone, SIM kit, and carrier subscription\n" +
                    "Ceramic Shield, tougher than any smartphone glass\n" +
                    "A14 Bionic chip, the fastest chip ever in a smartphone",
                    1,
                    "Cell Phones",
                    899.99,
                    "https://m.media-amazon.com/images/I/71fVoqRC0wL._FMwebp__.jpg",
                    "Apple iPhone 12 (64GB, Black) "));

            add(new Product(0,
                    "Samsung Galaxy A30S w/On-Screen Fingerprint (64GB, 4GB) 6.4\", Triple Camera, Dual SIM GSM Unlocked A307G/DS - US + Global 4G LTE International Model (64GB + 64GB SD + Case Bundle) (White)",
                    100,
                    "6.4 inch Infinity-V Super AMOLED display, 720 x 1560 pixels, 19.5:9 ratio (~268 ppi density), 4000 mAh Battery with Fast charging 15W, On-Screen Fingerprint\n" +
                            "64GB ROM, 4GB RAM - microSD Up to 1TB, Triple Rear Camera (25MP+8MP+5MP) with LED Flash, Panorama, HDR & 16MP Front Facing Camera\n" +
                            "Android OS, Exynos 7885, Octa-Core (Dual Core 1.8 GHz Cortex-A73 & Hexa Core 1.6 GHz Cortex-A53), Mali-G71\n" +
                            "3G HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100, 4G LTE band 1(2100), 2(1900), 3(1800), 4(1700/2100), 5(850), 7(2600), 8(900), 12(700), 13(700), 17(700), 20(800), 28(700), 38(2600), 40(2300), 41(2500), 66(1700/2100)\n" +
                            "International Model - No Warranty in US. Compatible with Most GSM Carriers like T-Mobile, AT&T, MetroPCS, etc. Will NOT work with CDMA Carriers Such as Verizon, Sprint, Boost.",
                    2,
                    "Cell Phones",
                    282.0,
                    "https://images-na.ssl-images-amazon.com/images/I/616lmgR9dwL._AC_SL1000_.jpg",
                    "Samsung Galaxy A30S"));

            add(new Product(0,
                    "BLU G9 Pro -6.3” Full HD Smartphone with Triple Main Camera, 128GB+4GB RAM -Nightfall",
                    100,
                    "Vivid 6.3” Full HD+ Infinity Display, Corning Gorilla Glass 3\n" +
                            "A.I Triple Camera 48MP + 2MP Depth Sensor + 8MP Wide Angle 120° Camera with flash, and 16MP Selfie camera\n" +
                            "128GB Internal memory 4GB RAM Micro SD up to 128GB; Mediatek Helio P60 Octa-Core 2.0GHz processor | 64 bit with AI technology\n" +
                            "Super 4,000mAh battery with 18W Ultra Quick Charge, Wireless Charging Compatible, and Fingerprint sensor\n" +
                            "4G LTE (1/2/3/4/5/7/8/12/13/17/28) 3G: (850/900/1700/1900/2100): US compatibility Nationwide on all GSM Networks including AT&T, T-Mobile, Cricket, Metro PCS, and others. Not compatible with CDMA Networks like Verizon, Sprint and Boost Mobile)",
                    3,
                    "Cell Phones",
                    199.99,
                    "https://images-na.ssl-images-amazon.com/images/I/81cH%2BNRSZGL._AC_SL1500_.jpg",
                    "BLU G9 Pro "));

            add(new Product(0,
                    "Huawei Nova 5T (128GB, 8GB) 6.26\" LCD, Kirin 980, 48MP Quad Camera, 22.5W Fast Charge, Dual SIM GSM Unlocked Global 4G LTE International Model YAL-L21 (Black)",
                    100,
                    "Huawei Nova 5T (128GB, 8GB) 6.26\" LCD, Kirin 980, 48MP Quad Camera, 22.5W Fast Charge, Dual SIM GSM Unlocked Global 4G LTE International Model YAL-L21 (Black)",
                    4,
                    "Cell Phones",
                    333.99,
                    "https://images-na.ssl-images-amazon.com/images/I/6119fiwoLML._AC_SL1000_.jpg",
                    "Huawei Nova 5T (128GB, 8GB) "));

            add(new Product(0,
                    "Acer Aspire 5 Slim Laptop, 15.6 inches Full HD IPS Display, AMD Ryzen 3 3200U, Vega 3 Graphics, 4GB DDR4, 128GB SSD, Backlit Keyboard, Windows 10 in S Mode, A515-43-R19L, Silver",
                    100,
                    "AMD Ryzen 3 3200U Dual Core Processor (Up to 3.5GHz); 4GB DDR4 Memory; 128GB PCIe NVMe SSD\n" +
                            "15.6 inches full HD (1920 x 1080) widescreen LED backlit IPS display; AMD Radeon Vega 3 Mobile Graphics\n" +
                            "1 USB 3.1 Gen 1 port, 2 USB 2.0 ports & 1 HDMI port with HDCP support\n" +
                            "802.11ac Wi-Fi; Backlit Keyboard; Up to 7.5 hours battery life\n" +
                            "Windows 10 in S mode. Maximum power supply wattage: 65 Watts",
                    5,
                    "Laptop",
                    364.99,
                    "https://images-na.ssl-images-amazon.com/images/I/71vvXGmdKWL._AC_SL1500_.jpg",
                    "Acer Aspire 5 Slim"));

            add(new Product(0,
                    "ASUS VivoBook 15 Thin and Light Laptop, 15.6” FHD, Intel Core i3-8145U CPU, 8GB RAM, 128GB SSD, Windows 10 in S Mode, F512FA-AB34, Slate Gray",
                    100,
                    "15.6 inch full HD 4 way NanoEdge bezel display with stunning 88% screen-to-body ratio\n" +
                            "Intel core i3-8145U processor (4M Cache, upto 3.9 GHz)\n" +
                            "8GB RAM and 128GB M.2 SSD; Windows 10 in S mode (switchable to windows 10 home)\n" +
                            "Ergonomic backlit chiclet keyboard with fingerprint sensor activated via Windows hello.Bluetooth 4.1\n" +
                            "Exclusive Ergolift design for an improved typing position\n" +
                            "Comprehensive connections including USB 3.1 Type-C , USB 3.1 Type-A, USB 2.0, and HDMI; Gigabit Wi-Fi 5 (802.11ac) (USB transfer speed may vary. Learn more at ASUS website)",
                    6,
                    "Laptop",
                    498.99,
                    "https://images-na.ssl-images-amazon.com/images/I/81mZ4eDWYkL._AC_SL1500_.jpg",
                    "ASUS VivoBook 15"));

            add(new Product(0,
                    "New Apple MacBook Pro (16-inch, 16GB RAM, 512GB Storage, 2.6GHz Intel Core i7) - Silver",
                    100,
                    "Ninth-generation 6-Core Intel Core i7 Processor\n" +
                            "Stunning 16-inch Retina Display with True Tone technology\n" +
                            "Touch Bar and Touch ID\n" +
                            "AMD Radeon Pro 5300M Graphics with GDDR6 memory\n" +
                            "Ultrafast SSD\n" +
                            "Intel UHD Graphics 630\n" +
                            "Six-speaker system with force-cancelling woofers",
                    1,
                    "Laptop",
                    2099.0,
                    "https://images-na.ssl-images-amazon.com/images/I/71UItVa0VmL._AC_SL1500_.jpg",
                    "Apple MacBook Pro"));

            add(new Product(0,
                    "Sony X900H 65 Inch TV: 4K Ultra HD Smart LED TV with HDR, Game Mode for Gaming, and Alexa Compatibility - 2020 Model",
                    100,
                    "4K HDR PROCESSOR X1: See premium 4K pictures, rich with real-world detail and texture. Upscale everything you watch to near-4K with 4K X-Reality PRO.\n" +
                            "TRILUMINOS Display: See exactly what the creator intended with advanced color and gradation.\n" +
                            "FULL ARRAY LED with local dimming: Brighter highlights and detailed dark scenes along with realistic contrast enhanced by X-tended Dynamic Range.\n" +
                            "GAME MODE: Take your PlayStation experience to the next level with a Sony 4K gaming TV featuring dedicated Game Mode for a smoother, more responsive gaming experience.",
                    7,
                    "Television",
                    1452.68,
                    "https://images-na.ssl-images-amazon.com/images/I/81x6u8MEm4L._AC_SL1500_.jpg",
                    "Sony X900H 65 Inch TV"));

            add(new Product(0,
                    "Acer Aspire TC-895-UA92 Desktop, 10th Gen Intel Core i5-10400 6-Core Processor, 12GB 2666MHz DDR4, 512GB NVMe M.2 SSD, 8X DVD, 802.11ax Wi-Fi 6, USB 3.2 Type C, Windows 10 Home",
                    100,
                    "10th Generation Intel Core i5-10400 6-Core Processor (Up to 4.3GHz)\n" +
                            "12GB 2666MHz DDR4 Memory | 512GB NVMe M.2 SSD | 8X DVD-Writer Double-Layer Drive (DVD-RW)\n" +
                            "Intel Wireless Wi-Fi 6 AX200 802.11ax Dual-Band 2.4GHz and 5GHz featuring 2x2 MU-MIMO technology | Bluetooth 5.1 | 10/100/1000 Gigabit Ethernet LAN\n" +
                            "1 - USB 3.2 Type C Gen 1 port (up to 5 Gbps) (Front) | 5 - USB 3.2 Gen 1 Ports (1 Front and 4 Rear) | 2 - USB 2.0 Ports (Rear) | 2 - HDMI Ports\n" +
                            "Windows 10 Home (USB Keyboard and Mouse Included)",
                    0,
                    "Desktop",
                    529.99,
                    "https://images-na.ssl-images-amazon.com/images/I/61A%2BK1MjTeL._AC_SL1500_.jpg",
                    "Acer Aspire"));

            add(new Product(0,
                    "Dell Optiplex 990 SFF PC, Intel Core i5 Processor, 16GB RAM, 2TB HDD, DVDRW, Keyboard & Mouse, WiFi, Bluetooth 4.0, Windows 10 Pro, 20in LCD Monitor",
                    100,
                    "Lightning Fast: Powered by Intel's top of the line Core i5 series processor and loaded with 16 GB of RAM, this machine will outperform the competition in any situation.\n" +
                            "Massive Storage: Packed with 2 TB of hard drive space, you can store all of the apps, games, photos, music and movies that you need.\n" +
                            "Get Connected: Comes with a vibrant 20-inch LCD Monitor (Brands may vary). The included Bluetooth 4.0 Adapter, Wi-Fi Adapter and Keyboard & Mouse will have you up and running with ease, keeping you connected. Microsoft's latest and best OS to date, Windows 10 Professional, will maximize the power and utility of your new machine.",
                    0,
                    "Desktop",
                    332.07,
                    "https://images-na.ssl-images-amazon.com/images/I/71ySan4CA8L._AC_SL1500_.jpg",
                    "Dell Optiplex 990"));

            add(new Product(0,
                    "iBUYPOWER Gaming PC Computer Desktop Element MR 9320 (Intel i7-10700F 2.9GHz, NVIDIA GTX 1660 Ti 6GB, 16GB DDR4 RAM, 240GB SSD, 1TB HDD, Wi-Fi ready, Windows 10 Home)",
                    100,
                    "System: Intel i7-10700F 2.9GHz (4.8GHz Max Turbo) 16GB DDR4 RAM 240GB SSD 1TB HDD Genuine Windows 10 Home 64-bit\n" +
                            "Graphics: NVIDIA GeForce GTX 1660 Ti 6GB Dedicated Gaming Video Card VR Ready 1x DVI 1x HDMI 1x Display Port\n" +
                            "Connectivity: 4 x USB 3.0 2 x USB 2.0 1x RJ-45 Network Ethernet 10/100/1000 Audio: 7.1 Channel\n" +
                            "Special Add-Ons: Tempered Glass RGB Gaming Case 802.11AC Wi-Fi Included 16 Color RGB Lighting Case Free iBuyPower Gaming Keyboard & RGB Gaming Mouse No Bloatware\n" +
                            "Warranty: 1 year parts & labor + free lifetime US tech support; Assembled in the U.S.A",
                    0,
                    "Desktop",
                    999.99,
                    "https://images-na.ssl-images-amazon.com/images/I/715zrA5cmLL._AC_SL1500_.jpg",
                    "iBUYPOWER Gaming PC Computer"));

            add(new Product(0,
                    "Lenovo ThinkCentre Small Form Desktop PC Computer Package, Intel Quad Core i5 up to 3.4GHz, 8G DDR3, 1T, DVD, VGA, DP, 19 Inch LCD Monitor(Brands May Vary), Keyboard, Mouse, Win 10 Pro 64 (Renewed)",
                    100,
                    "CERTIFIED REFURBISHED - This Certified Refurbished product is tested and certified to look and work like new. The refurbishing process includes functionality testing, basic cleaning, inspection, and repackaging. The product ships with all relevant accessories, a minimum 90-day warranty, and may arrive in a generic box. Only select sellers who maintain a high-performance bar may offer Certified Refurbished products on Amazon.com.\n" +
                            "COMPLETE SET WITH MORE CONVENIENCE - You will receive one Lenovo high performance PC, one 19 inch LCD monitor(Brands May Vary), one Keyboard and one mouse that you could start work or study at once.\n" +
                            "POWERFUL PROCESSOR & SUPERIOR STORAGE AND MEMORY - Built with an Intel Quad Core i5 processor, up to 3.4 GHz, which you can expect fast, reliable performance and an exceptional PC experience; 1 TB storage space to save your favorite media and still have tons of room to work. 8 GB DDR3 RAM will help you zip through your tasks in a hurry.\n" +
                            "MULTI LANGUAGE WINDOWS 10 PROFESSIONAL & OFFICE 365 FREE TRAIL - A new, clean installation completely free of bloatware come with multi languages in English/Spanish/French which meet more demands. 30 Days Office 365 free trails helps your work easy and efficient.",
                    0,
                    "Desktop",
                    219.89,
                    "https://images-na.ssl-images-amazon.com/images/I/71WOvnIvHRL._AC_SL1500_.jpg",
                    "Lenovo ThinkCentre Small"));

            add(new Product(0,
                    "Newest All-in-One Lenovo - IdeaCentre A340-22IGM | 2020 Flagship Edition for Home Student and Work| 21.5\" Touch-Screen | Intel Pentium Silver | 8GB DDR4 | 1TB HDD | Business Black",
                    100,
                    "Accelerate everything you do with the IdeaCentre A340-22IGM. Powered by an Intel Pentium J5005 processor with Intel UHD Graphics 605, this all-in-one computer makes multitasking a breeze.\n" +
                            "The 1920 x 1080 Full HD display gives you an outstanding viewing experience, from wide angles, too. The narrow bezels are just 9.5 mm at their thinnest for a huge 90% screen-to-body ratio for more screen and fewer distractions.\n" +
                            "For PC peripherals, such as a mouse, keyboard, and backup drive, the IdeaCentre A340-22IGM has plenty of ports. In addition to USB 3.1 and 2.0, this all-in-one PC has a 3-in-1 card reader and HDMI out, should you need a second screen\n" +
                            "Work, entertainment, or video calls – the eye-catching IdeaCentre A340-22IGM will look and perform great anywhere. With its stylish stand and base, this all-in-one desktop computer will save much-needed desk space.",
                    0,
                    "All-in-One",
                    699.00,
                    "https://images-na.ssl-images-amazon.com/images/I/81VyuMkh32L._AC_SL1500_.jpg",
                    "Lenovo-IdeaCentre"));

            add(new Product(0,
                    "TCL 40S325 40 Inch 1080p Smart LED ROKU TV (2019)",
                    100,
                    "Easy Voice Control: Works with Amazon Alexa or Google Assistant to help you find movie titles, launch or change channels, even switch inputs, using just your voice. Also available through the Roku mobile app\n" +
                            "Smart Functionality offers access to over 5,000 streaming channels featuring more than 500,000 movies and TV episodes via Roku TV\n" +
                            "1080p Full HD Resolution excellent detail, color, and contrast\n" +
                            "Direct lit LED produces great picture quality with 60Hz refresh Rate for fast moving action scenes with virtually no Motion blur\n" +
                            "Inputs: 3 HDMI, 1 USB, RF, Composite, Headphone Jack, Optical audio Out",
                    0,
                    "Television",
                    179.99,
                    "https://images-na.ssl-images-amazon.com/images/I/71YZlXXFktL._AC_SL1500_.jpg",
                    "TCL 40S325"));

            add(new Product(0,
                    "Hisense 32-Inch 32H5500F Class H55 Series Android Smart TV with Voice Remote (2020 Model)",
                    100,
                    "Inputs & Outputs: 2 HDMI ports, 1 Ethernet port, 2 USB Ports (v 2.0), 1 Digital Audio Output (Optical), 1 RCA Composite Video Input, 1 L/R Audio Input for composite\n" +
                            "Measuring 28.7 x 17 x 2.9 inches and 8.6 pounds (28.7 x 18.8 x 7.6 inches with included stand, LxWxH and 8.8 pounds), the 32h5500f has a 1-year manufacturer's warranty, and includes a remote (batteries included), power cable, and quick start guide.\n" +
                            "Combining sharp 720p picture quality, the voice-enabled android TV platform, built-in Wi-Fi, and innovative technologies, Hisense h55 series smart TVs are great for all your needs — streaming, cable, satellite, gaming, and free over-the-air TV.\n" +
                            "Control the TV via the easy-to-use voice-enabled remote — Open or search for apps, control the volume and inputs, or search for your favorite TV shows and movies.",
                    0,
                    "Television",
                    129.99,
                    "https://images-na.ssl-images-amazon.com/images/I/8161gQWMnNL._AC_SL1500_.jpg",
                    "Hisense 32H5500F"));

            add(new Product(0,
                    "TCL 50\" 5-Series 4K UHD Dolby Vision HDR QLED ROKU Smart TV - 50S535",
                    100,
                    "Superior 4K Ultra HD: Picture clarity combined with the contrast, color, and detail of Dolby Vision HDR (High Dynamic Range) for the most lifelike picture.\n" +
                            "QLED: Quantum dot technology delivers better brightness and wider color volume.\n" +
                            "Product Size (WxHxD) with Stand: 43.9 x 11.6\" x 27.5\" | Product Size (WxHxD) without stand: 43.9\" x 3.0\" x 25.2\" | Product Weight without stand: 26.0 lbs | Product Weight with stand: 26.7 lbs\n" +
                            "Roku Smart TV Platform: Roku Smart TV platform provides access to thousands of streaming channels\n" +
                            "Auto Game Mode for an optimized fast-response gaming experience",
                    0,
                    "Television",
                    399.99,
                    "https://images-na.ssl-images-amazon.com/images/I/91tMNAWWsPL._AC_SL1500_.jpg",
                    "TCL 50\" 5-Series 4K"));

            add(new Product(0,
                    "Komodo by Sceptre KU515R 50\" 4K UHD Ultra Slim LED TV 3840x2160 Memc 120, Metal Black 2019",
                    100,
                    "Memc 120 with a MEMC 120 (Motion Estimation and Motion Compensation), all action-packed sequences will flow smoothly from frame to frame for the ultimate experience. Enjoy every moment of the auto enhanced picture quality especially for all your favorite sports, video games, and movies packed with action\n" +
                            "Superior 4K Picture Enter an unrivaled world of color variation, impressive contrasts, and image detail with 4K resolution (3840 x 2160). Sceptre 4K delivers a superior picture with 8 million pixels, four times more than a 1080P Full HDTV.Brightness:273 cd/m2\n" +
                            "HDCP 2. 2 HDCP 2. 2 ensures that all the 4K content that is transferred from a source (Blu-Ray player, DVD player, etc. ) to the display (the TV) is secured with copyright protection. Bearing your convenience and future use in mind, Sceptre is compliant with HDCP 2. 2 on most of its 4K UHD TVs.",
                    0,
                    "Television",
                    229.98,
                    "https://images-na.ssl-images-amazon.com/images/I/91F2-%2B8KynL._AC_SL1500_.jpg",
                    "Komodo Sceptre KU515R"));

            add(new Product(0,
                    "Moto G Power | 3-Day Battery1 | Unlocked | Made for US by Motorola | 4/64GB | 16MP Camera | 2020 | Black",
                    100,
                    "Unlocked for the freedom to choose your carrier. Compatible with AT&T, Sprint, T-Mobile, and Verizon networks. SIM card not included. Customers may need to contact Sprint for activation on Sprint’s network.\n" +
                            "Up to 3 day battery *. Go up to three days1 on a single charge thanks to a 5000 mAh battery.\n" +
                            "16 MP triple camera system. Capture ultra-wide angle panoramas, sharper portraits, and super detailed close-up shots.\n" +
                            "Dual Stereo Speakers tuned by Dolby. Enjoy 4x more crystal-clear audio that’s 4x more powerful2 with dual stereo speakers tuned by Dolby.",
                    0,
                    "Cell Phones",
                    179.99,
                    "https://images-na.ssl-images-amazon.com/images/I/81ZronJUUPL._AC_SL1500_.jpg",
                    "Moto G Power"));

            add(new Product(0,
                    "Google Pixel 5 - 5G Android Phone - Water Resistant - Unlocked Smartphone with Night Sight and Ultrawide Lens - Sorta Sage",
                    100,
                    "New, unlocked Android phone gives you the flexibility to change carriers and choose your own data plan; unlocked smartphone works with T-Mobile, Sprint, AT&T, Verizon, and other major carriers[1]\n" +
                            "5G capable[2] smartphone gives you an extra boost of speed so you can download a movie in seconds,[3] enjoy smooth streaming in ultra clear HD, play games at home and on the go,[4] and even share your 5G speed with friends[5]\n" +
                            "Charge your cell phone wirelessly[6] or use it to wirelessly charge other Qi-certified devices[7]\n" +
                            "The all day battery can last up to 48 hours with Extreme Battery Saver[8]\n" +
                            "Your phone will automatically receive the latest OS and security updates for at least 3 years;[9] the custom-made Titan M chip helps secure the operating system and sensitive data, like passwords",
                    0,
                    "Cell Phones",
                    649.00,
                    "https://images-na.ssl-images-amazon.com/images/I/81kmE1z%2BsaL._AC_SL1500_.jpg",
                    "Google Pixel 5"));

            add(new Product(0,
                    "Cyberpunk 2077 - PlayStation 4",
                    100,
                    "Cyberpunk 2077 is an open-world, action-adventure story set in Night City\n" +
                            "Become a cyberpunk, an urban mercenary equipped with cybernetic enhancements and build your legend on the streets of Night City\n" +
                            "Take the riskiest job of your life and go after a prototype implant that is the key to immortality",
                    0,
                    "Games",
                    49.94,
                    "https://images-na.ssl-images-amazon.com/images/I/81iR0aGNJ5L._SL1500_.jpg",
                    "Cyberpunk 2077"));
        }};

        for (Product item : products) {
            productsService.save(item);
        }

        return "redirect:/";
    }
}
