package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("active_options")
    val activeOptions: ActiveOptions = ActiveOptions(),
    @SerializedName("availability_set")
    val availabilitySet: Boolean = false, // false
    @SerializedName("average_ratings")
    val averageRatings: AverageRatings? = null,
    @SerializedName("average_reviews")
    val averageReviews: AverageReviews? = null,
    @SerializedName("campsite_category")
    val campsiteCategory: Any? = null, // null
    @SerializedName("cancel_policy")
    val cancelPolicy: String = "", // flexible
    @SerializedName("cancel_policy_combo_bookings")
    val cancelPolicyComboBookings: String = "",
    @SerializedName("cancel_text")
    val cancelText: String = "",
    @SerializedName("catalog")
    val catalog: Any? = null, // null
    @SerializedName("check_in")
    val checkIn: Int = 0, // 0
    @SerializedName("check_out")
    val checkOut: Int = 0, // 0
    @SerializedName("children_count")
    val childrenCount: Int = 0, // 0
    @SerializedName("coachnet_ready")
    val coachnetReady: Boolean = false, // true
    @SerializedName("coachnet_required")
    val coachnetRequired: Boolean = false, // false
    @SerializedName("combined_special_hours")
    val combinedSpecialHours: List<Any> = listOf(),
    @SerializedName("created")
    val created: String = "", // 0001-01-01T00:00:00Z
    @SerializedName("current_location_id")
    val currentLocationId: Int = 0, // 0
    @SerializedName("custom_insurance_text")
    val customInsuranceText: String = "",
    @SerializedName("dealer")
    val dealer: Boolean = false, // false
    @SerializedName("delivery")
    val delivery: Boolean = false, // true
    @SerializedName("delivery_radius")
    val deliveryRadius: Int = 0, // 30
    @SerializedName("delivery_usage_item_id")
    val deliveryUsageItemId: Int = 0, // 449998
    @SerializedName("deposit_percentage")
    val depositPercentage: Int = 0, // 0
    @SerializedName("description")
    val description: String = "",
    @SerializedName("description_included")
    val descriptionIncluded: String = "", // - WiFi Router- Two TV's with Direct TV, Netflix, & Amazon Prime- Wireless Headphones (2)- HDMi Cord (1)- Apple Chargers (7)- USB-C Chargers (3)- RV Toilet Paper- Hand Soap- Paper TowelsFor your convenience, a bike rack or StowAway Max Hitch cargo box are available for FREE if you'd like. 
    @SerializedName("description_other")
    val descriptionOther: String = "", // Kids can plug in their favorite game station (Xbox or ps) into the entertainment system via the HDMI cable, and enjoy the powerful sound system.We also have a Stow-A-Way enclosed trailer box for storage (max 200 lbs) and/or a Hitch Mount 4-Bike Rack. Both are available upon request for FREE. 
    @SerializedName("description_recommendations")
    val descriptionRecommendations: String = "", // This Sprinter is NOT designed for overnight camping at RV Parks, but rather for luxury travel to meetings, golf trips, hotels or other final destinations. Great for first class business needs, Anniversaries, Birthdays, Night on the Town, Vacations, Weddings, Business Travel, Leisure Events, Wine Tours, Proms & Graduations, trips with elderly parents, real estate showings, tailgating, etc.
    @SerializedName("display_vehicle_type")
    val displayVehicleType: String = "", // Class B
    @SerializedName("distributed_ratings")
    val distributedRatings: DistributedRatings? = null,
    @SerializedName("education")
    val education: List<Any> = listOf(),
    @SerializedName("Explanation")
    val explanation: Any? = null, // null
    @SerializedName("external")
    val `external`: Boolean = false, // false
    @SerializedName("favorite")
    val favorite: Boolean = false, // false
    @SerializedName("favorite_count")
    val favoriteCount: Int = 0, // 53
    @SerializedName("features")
    val features: Features = Features(),
    @SerializedName("FeaturesMap")
    val featuresMap: Any? = null, // null
    @SerializedName("first_published")
    val firstPublished: String = "", // 2023-04-30T07:58:03.063355-07:00
    @SerializedName("generator_usage_item_id")
    val generatorUsageItemId: Int = 0, // 450001
    @SerializedName("group_on_map")
    val groupOnMap: Boolean = false, // false
    @SerializedName("group_reviews_num")
    val groupReviewsNum: Int = 0, // 0
    @SerializedName("group_reviews_score")
    val groupReviewsScore: Int = 0, // 0
    @SerializedName("group_score")
    val groupScore: Int = 0, // 0
    @SerializedName("has_been_published")
    val hasBeenPublished: Boolean = false, // true
    @SerializedName("has_checkout_questions")
    val hasCheckoutQuestions: Boolean = false, // false
    @SerializedName("hidden")
    val hidden: Boolean = false, // false
    @SerializedName("host_notes")
    val hostNotes: String = "",
    @SerializedName("house_rules")
    val houseRules: String = "",
    @SerializedName("instant_book")
    val instantBook: Boolean = false, // true
    @SerializedName("instant_book_leeway")
    val instantBookLeeway: Int = 0, // 1
    @SerializedName("insurance_coverage")
    val insuranceCoverage: String = "",
    @SerializedName("insurance_eligible")
    val insuranceEligible: Boolean = false, // true
    @SerializedName("insurance_plan")
    val insurancePlan: InsurancePlan? = null,
    @SerializedName("insurance_renter_adjustable")
    val insuranceRenterAdjustable: Boolean = false, // false
    @SerializedName("insurance_state")
    val insuranceState: String = "", // approved
    @SerializedName("last_published")
    val lastPublished: String = "", // 2023-04-30T07:58:03.063308-07:00
    @SerializedName("listing_questions")
    val listingQuestions: List<ListingQuestions> = listOf(),
    @SerializedName("locale")
    val locale: Locale = Locale(),
    @SerializedName("location")
    val location: Location = Location(),
    @SerializedName("mileage_usage_item_id")
    val mileageUsageItemId: Int = 0, // 450002
    @SerializedName("minimum_days")
    val minimumDays: Int = 0, // 0
    @SerializedName("minimum_deposit")
    val minimumDeposit: Int = 0, // 0
    @SerializedName("monthly_discount")
    val monthlyDiscount: Int = 0, // 0
    @SerializedName("name")
    val name: String = "", // 2023 Ultimate Toys, Ultimate Coach (Mercedes Sprinter)
    @SerializedName("nearby_content")
    val nearbyContent: List<Any> = listOf(),
    @SerializedName("original_url")
    val originalUrl: String = "",
    @SerializedName("owner_score")
    val ownerScore: Double = 0.0, // 0.433
    @SerializedName("parent_id")
    val parentId: Int = 0, // 0
    @SerializedName("position")
    val position: Int = 0, // 0
    @SerializedName("preferred_primary_image")
    val preferredPrimaryImage: PreferredPrimaryImage = PreferredPrimaryImage(),
    @SerializedName("prep_fee")
    val prepFee: PrepFee = PrepFee(),
    @SerializedName("presentment_currency")
    val presentmentCurrency: String = "", // USD
    @SerializedName("price_per_day")
    val pricePerDay: Int = 0, // 48500
    @SerializedName("price_per_month")
    val pricePerMonth: Int = 0, // 1113075
    @SerializedName("price_per_week")
    val pricePerWeek: Int = 0, // 291000
    @SerializedName("primary_image_url")
    val primaryImageUrl: String = "", // https://res.cloudinary.com/outdoorsy/image/upload/v1682866075/p/rentals/357465/images/cgjtw1ryiiq0tonlm5zd.jpg
    @SerializedName("pro")
    val pro: Boolean = false, // false
    @SerializedName("published")
    val published: Boolean = false, // true
    @SerializedName("ranking")
    val ranking: Ranking = Ranking(),
    @SerializedName("rental_category")
    val rentalCategory: String = "", // rv
    @SerializedName("rental_score")
    val rentalScore: Double = 0.0, // 0.857
    @SerializedName("request_less_than_minimum_days")
    val requestLessThanMinimumDays: Int = 0, // 0
    @SerializedName("review_scores")
    val reviewScores: ReviewScores? = null,
    @SerializedName("reviews_num")
    val reviewsNum: Int = 0, // 9
    @SerializedName("score")
    val score: Double = 0.0, // 4.4
    @SerializedName("seatbelts")
    val seatbelts: Int = 0, // 10
    @SerializedName("security_deposit")
    val securityDeposit: Int = 0, // 100000
    @SerializedName("seo_content")
    val seoContent: SeoContent = SeoContent(),
    @SerializedName("settlement_currency")
    val settlementCurrency: String = "", // USD
    @SerializedName("sleeps")
    val sleeps: Int = 0, // 2
    @SerializedName("sleeps_adults")
    val sleepsAdults: Int = 0, // 0
    @SerializedName("sleeps_kids")
    val sleepsKids: Int = 0, // 0
    @SerializedName("slug")
    val slug: String = "", // /rv-rental/norcross_ga/2023_ultimate-toys_ultimate-coach_357465-listing
    @SerializedName("smart_photo_score")
    val smartPhotoScore: Int = 0, // 0
    @SerializedName("sort_score")
    val sortScore: Double = 0.0, // 6.567965
    @SerializedName("stay")
    val stay: Any? = null, // null
    @SerializedName("stay_catalog")
    val stayCatalog: Any? = null, // null
    @SerializedName("summary")
    val summary: String = "",
    @SerializedName("tags")
    val tags: List<Any> = listOf(),
    @SerializedName("tax_rates")
    val taxRates: List<TaxRate> = listOf(),
    @SerializedName("type")
    val type: String = "", // b
    @SerializedName("unavailable")
    val unavailable: Boolean = false, // false
    @SerializedName("updated")
    val updated: String = "", // 0001-01-01T00:00:00Z
    @SerializedName("use_day_pricing")
    val useDayPricing: Boolean = false, // false
    @SerializedName("use_tax_inclusive_pricing")
    val useTaxInclusivePricing: Boolean = false, // false
    @SerializedName("user_slug")
    val userSlug: String = "",
    @SerializedName("vehicle_amps")
    val vehicleAmps: Int = 0, // 0
    @SerializedName("vehicle_box_length")
    val vehicleBoxLength: Int = 0, // 0
    @SerializedName("vehicle_class")
    val vehicleClass: String = "",
    @SerializedName("vehicle_dry_weight")
    val vehicleDryWeight: Int = 0, // 0
    @SerializedName("vehicle_gvwr")
    val vehicleGvwr: Int = 0, // 0
    @SerializedName("vehicle_height")
    val vehicleHeight: Int = 0, // 0
    @SerializedName("vehicle_length")
    val vehicleLength: Double = 0.0, // 21.5
    @SerializedName("vehicle_length_with_hitch")
    val vehicleLengthWithHitch: Int = 0, // 0
    @SerializedName("vehicle_license_plate_state")
    val vehicleLicensePlateState: String = "", // GA
    @SerializedName("vehicle_make")
    val vehicleMake: String = "", // Ultimate Toys
    @SerializedName("vehicle_model")
    val vehicleModel: String = "", // Ultimate Coach
    @SerializedName("vehicle_title")
    val vehicleTitle: String = "", // 2023 Ultimate Toys Ultimate Coach
    @SerializedName("vehicle_width")
    val vehicleWidth: Int = 0, // 0
    @SerializedName("vehicle_year")
    val vehicleYear: Int = 0, // 2023
    @SerializedName("weekly_discount")
    val weeklyDiscount: Int = 0 // 0
)