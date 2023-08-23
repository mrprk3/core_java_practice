package com.mrprk.tp;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class PrepaidConstants {

	private PrepaidConstants() {
		// do nothing
	}

	public static final String FOOTER = "2023 © TerraPay Holdings Limited All rights reserved.";

	public static final Integer DEFAULT_CARD_LAST_FOUR_DIGITS_LENGTH = 4;

	public static final Integer DEFAULT_PAGE_SIZE = 10;

	public static final Integer DEFAULT_PAGE_SIZES = 50;

	public static final Integer MAX_PAGE_SIZE_FOR_MCC = 999;

	public static final Long DEFAULT_SALES_AGENT_ID = (long) 1;

	public static final Double HUNDRED = 100.00D;

	public static final String SSN_MASK_FORMAT = "xxxxx####";

	public static final String REQ_PARAM_ACCESS_TOKEN = "access_token";
	public static final String IS_AUTHENTICATED_FULLY = "IS_AUTHENTICATED_FULLY";
	public static final String IS_AUTHENTICATED_REMEMBERED = "IS_AUTHENTICATED_REMEMBERED";
	public static final String IS_AUTHENTICATED_ANONYMOUSLY = "IS_AUTHENTICATED_ANONYMOUSLY";
	public static final String ORDER_PREFIX = "GRORD";
	public static final Integer ACTIVE_STATUS = 0;
	public static final String USER_ACTIVE_STATUS = "a";
	public static final Integer ZERO = 0;
	public static final Double DoubleZERO = 0D;
	public static final Long LongZERO = (long) 0;
	public static final Long LongONE = (long) 1;
	public static final Long LongTWO = (long) 2;
	public static final String ADMIN_CATEGORY = "Admin";
	public static final String AGENT_CATEGORY = "Agent";
	public static final String ADMIN_STATUS = "Success";
	public static final String EMAIL_TOKEN_FORGOT_PASSWORD = "FORGOT_PASSWORD";
	public static final String EMAIL_TOKEN_SET_NEW_PASSWORD = "SET_NEW_PASSWORD";
	public static final String MW_CUSTOMER_UPDATE_BY = "CUSTOMER";
	public static final String MW_ADMIN_UPDATE_BY = "ADMIN";
	public static final String EMPTY = "EMPTY";
	public static final String PENDING = "Pending";
	public static final String ACTIVE = "Active";
	public static final String SUSPENDED = "Suspended";
	public static final String PROCESSING = "Processing";
	public static final String ONHOLD = "On Hold";
	public static final String LOST = "Lost";
	public static final String EXECUTED = "Executed";
	public static final String DECLINED = "Declined";
	public static final String DELETED = "Deleted";
	public static final String DESTROYED = "Destroyed";
	public static final String EXPIRED = "Expired";
	public static final String PENDING_APPROVAL = "PendingApproval";
	public static final String CANCELLED = "Cancelled";
	public static final String FAILED = "Failed";
	public static final String PROCESSED = "Processed";
	public static final String REASON = "Suspended per customer request";

	public static final Long DEFAULT_CREATED_BY = Long.valueOf("1");

	public static final Integer ACCOUNT_NUMBER_LENGTH = 8;
	public static final Integer CARD_PIN_LENGTH = 4;

	public static final Integer PASS_RETRY_COUNT = 3;

	public static final Integer NO_OF_CARDS = 1000;

	public static final String TEMPLATE_PATH = "/EmailTemplate/";
	public static final String CREATE_ADMIN_USER_TEMPLATE = TEMPLATE_PATH + "user_create.vm";
	public static final String DATE_FORMAT = "MM/dd/yyyy";
	public static final String DATE_FORMATDDMMYY = "dd/MM/yyyy";
	public static final String VALID_THRU_MONTH_FORMAT = "MM";
	public static final String VALID_THRU_YEAR_FORMAT = "yyyy";
	public static final String DATE_FORMAT_WITH_HYPHEN = "MM-dd-yyyy";
	public static final String DATE_TIME_FORMAT = "MM/dd/yyyy HH:mm:ss";
	public static final String REPORT_FILENAME_DATE_TIME_FORMAT = "MMddyyyyHHmmss";
	public static final String DATE_TIME_FORMAT_MARKER = "MM/dd/yyyy HH:mm:ss a";
	public static final String DATE_TIME_SEC_FORMAT = "MM/dd/yyyy HH:mm:ss";
	public static final String DATE_FORMAT_DDMMYY = "dd-MM-yy";
	public static final String HOUR_MIN_SEC_FORMAT = "HH:mm:ss";
	public static final String DD_MM_YYYY = "dd-MM-yyyy";
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String DATE_TIME_FORMAT_WITH_HYPHEN = "MM-dd-yyyy HH:mm:ss";
	public static final String TIMESTAMP_NANO_SEC_FORMAT = "MM/dd/yyyy HH:mm:ss.SSS";
	public static final String CREATE_CUSTOMER_TEMPLATE = TEMPLATE_PATH + "customer_create.vm";
	public static final String CREATE_ADMIN_FORGOT_PASSWORD_TEMPLATE = TEMPLATE_PATH + "admin_forgot_password.vm";
	public static final String CREATE_CUSTOMER_FORGOT_PASSWORD_TEMPLATE = TEMPLATE_PATH + "customer_forgot_password.vm";

	public static final Integer EMAIL_TOKEN_EXPIRY_TIME = 1440;

	public static final String GENERIC_YES = "Y";

	public static final String CARD_LOADED = "Y";

	public static final String GENERIC_NO = "N";

	public static final String VIEW_DETAIL_FLAG_YES = "Yes";

	public static final String VIEW_DETAIL_FLAG_NO = "No";

	public static final String CARD_TYPE = "CARD";

	public static final String ACCOUNT_TYPE = "ACCOUNT";

	public static final String AMOUNT_FORMAT = "#,##0.00";

	public static final String DOUBLE_AMOUNT_FORMAT = "###0.00";

	public static final String PREFIX_AMOUNT_FORMAT = "$";

	public static final String PREFIX_AMOUNT_WITH_FORMAT = "$0";

	// To hide the system related entities
	public static final String SYSTEMSALESAGENT = "System Sales Agent";

	public static final String SYSTEM_BANK = "SystemBank";

	public static final String SYSTEM_PROGRAM_MANAGER = "SystemProgramManager";

	public static final String SYSTEM_ROLE = "SuperAdminRole";

	public static final String SYSTEM_PARTNER = "SystemPartner";

	public static final String SYSTEM_AGENT = "SystemAgent";

	public static final String SYSTEM_SALES_AGENT = "SystemSalesAgent";

	public static final String AGENT_USER = "AGENT_USER_";

	public static final String CUSTOMER_USER = "CUSTOMER_";

	public static final String LOGIN_USER = "loginUser";

	public static final String AGENT_USER_LIST = "agentuserList";

	public static final String IS_EQUAL_TO = "IS_EQUAL_TO";

	public static final String IS_LESS_THAN = "IS_LESS_THAN";

	public static final String SUCCESS = "SUCCESS";

	public static final String STATUS_CODE_SUCCESS = "0";

	public static final String IS_GREATER_THAN = "IS_GREATER_THAN";

	public static final String IN_BETWEEN = "IN_BETWEEN";

	public static final String CARD_NUMBER_FLAG = "CARD_NUMBER";

	public static final String ACCOUNT_NUMBER_FLAG = "ACCOUNT_NUMBER";

	public static final DecimalFormat AMOUNTFORMATOR = new DecimalFormat(AMOUNT_FORMAT);

	public static final String CARD_DAMAGED_STATUS = "Damaged";

	public static final String CARD_LOST_STATUS = "Lost";

	public static final String SYSTEM_ACCOUNT = "System Account";

	public static final String REVENUE_ACCOUNT = "Revenue Account";

	public static final String ACCOUNT_TO_ACCOUNT_TRANSFER = "ACCOUNT_TO_ACCOUNT_TRANSFER";

	public static final String ACCOUNT_CLOSURE_FEE = "ACCOUNT_CLOSURE_FEE";

	public static final String NO_FEATURE_ACCESS = "CEC_1250";

	public static final String LOAD_AMOUNT = "loadAmount";

	public static final String LOAD_AMOUNT_AND_ACTIVATE = "loadAmountAndActivate";

	public static final String LOAD_REVERSAL = "reversal";

	public static final String FEE_REVERSAL = "feeReversal";

	public static final String STATUS = "status";

	public static final String CARD_STATUS = "cardStatus";

	public static final String CHANGE_STATUS = "changeStatus";

	public static final String CHANGE_CARD_STATUS = "changeCardStatus";

	public static final String BALANCE = "balance";

	public static final String CARD_BALANCE = "cardBalance";

	public static final String TRANSACTION_HISTORY = "transactionHistory";

	public static final String INVALID_REQUEST = "Invalid Request";

	public static final String INVALID_REQUEST_CODE = "0002";

	public static final String LOAD_ACTIVE_CARD = "load_multiple_cards_status_with_load_fee";

	public static final String LOAD_INACTIVE_CARD = "card_inactive_addamount_update";

	public static final String LOAD_REVERSE_CARD = "add_amount_reverse";

	public static final String LOAD_CARD_STATUS = "get_card_status";

	public static final String LOAD_CARD_BALANCE = "card_balance_agent";

	public static final String CARD_ACTIVATION = "card_activation";

	public static final String AGENT_CREDIT = "agent_credit";

	public static final String GET_CARD_HOLDER = "get_card_holder";

	public static final String LOYALTY_CARD = "371142";

	public static final String US_CODE = "001";

	public static final String INDIA_CODE = "91";

	public static final String TRUE = "true";

	public static final String FALSE = "false";

	public static final String RESET_SECURITY_KEY_BY_ADMIN = "Reset security key by Admin";

	public static final String RESET_SECURITY_KEY_BY_AGENT = "Reset security key by Agent user";

	public static final String RESET_SECURITY_KEY_BY_CUSTOMER = "Reset security key by Customer";

	public static final String US = "US";

	public static final String RESET_PASSWORD_BY_ADMIN = "Reset password by admin";

	public static final String RESET_PASSWORD_BY_EXT_CLIENT = "Reset password by external client";

	public static final String RESET_SECURITY_KEY_BY_EXT_CLIENT = "Reset security key by external client";

	public static final String RESET_PASSWORD_BY_AGENTUSER = "Reset password by Agent user";

	public static final Integer CUSTOMER_ACCOUNT_NUMBER_MIN_LENGTH = 10;

	public static final Integer CUSTOMER_ACCOUNT_NUMBER_MAX_LENGTH = 16;

	public static final Integer AGENT_ACCOUNT_NUMBER_MIN_LENGTH = 10;

	public static final Integer AGENT_ACCOUNT_NUMBER_MAX_LENGTH = 16;

	public static final String CUSTOMER_INFORMATION = "customerInformation";

	public static final String PIN_RESET = "pinReset";

	public static final String RESET_PASSWORD = "resetPassword";

	public static final String RESET_SECURITY_KEY = "resetSecurityKey";

	public static final String CARD_DETAIL = "cardDetail";

	public static final String INTEGRATION_PARTNER = "Integration_Partner";

	public static final String NORMAL_PARTNER = "TerraPay_Partner";

	public static final String INTEGRATION_PARTNER_LOAD = "integrationLoadPartner";

	public static final String INTEGRATION_PARTNER_INFORMATION_REVERSAL = "integrationReversalPartner";

	public static final String INTEGRATION_PARTNER_BALACNE_ENQUIRY = "integrationBalanceEnquiry";

	public static final String TRANSACTION_ENQUIRY_DECLINED_PENDING = "declinedAndPendingTransaction";

	public static final String PARTNER_DETAILS = "partnerDetail";

	public static final String CUSTOMER_UPDATE = "customerUpdate";

	public static final String REPLACE_CARD = "replaceCard";

	public static final String TRANSFER_CARD = "transferCard";

	public static final String CARDHOLDER_ACCOUNT_DETAIL = "cardHolderAccountDetail";

	public static final String CUSTOMER_CARDHOLDER_DETAIL = "customerCardHolderDetail";

	public static final String CARD_UPDATE = "cardUpdate";

	public static final String UPDATE_CARD = "card_update";

	public static final String BULK_CARD_CREATE = "create_card_bulk";

	public static final String ACCOUNT_LIMIT_UPDATE = "accountLimitUpdate";

	public static final String CUSTOMER_DETAILS = "customerDetail";

	public static final String CARD_HOLDER_REGISTRATION = "cardHolderRegistration";

	public static final String RESET_WRONG_PIN_COUNT = "wrongPinCountReset";

	public static final String USER_DETAIL = "userDetail";

	public static final String REMAP_AGENT = "RemapToAgent";

	public static final String DELETE_BATCH = "Deleted";

	public static final String PRIMARY_ACCOUNT = "Primary Account";

	public static final String SECONDARY_ACCOUNT = "Secondary Account";

	public static final String SWEEP_DOWN = "sweepDown";

	public static final String SWEEP_UP = "sweepUp";

	public static final String ARBITERPAY_SELF = "ARBITERPAY_SELF";

	public static final String APPROVE = "Approve";

	public static final Integer MAX_DOWNLOAD_SIZE = 60000;

	public static final String ARBITERPAY = "ARBITERPAY";

	public static final String MAILING_ADDRESS = "Mailing Address";

	public static final String PERMANENT_ADDRESS = "Permanent Address";

	public static final String PHYSICAL_ADDRESS = "Physical Address";

	public static final String SELF_PIN_CHANGE = "SELF_PIN_CHANGE";

	public static final String TRANSACTION_DETAIL = "transactionDetail";

	public static final String CUSTOM_CARD_HOLDER_ID = "Cardholder Id";

	public static final String CUSTOMER_BANK_DETAILS = "customerBankDetails";

	public static final String TRANSFER_BETWEEN_ACCOUNTS = "transferBetweenAccounts";

	public static final String FORGOT_USERNAME = "forgotUserName";

	public static final String FORGOT_PASSWORD = "forgotPassword";

	public static final String CUST_INFO_VALIDATION = "consumerInfoValAndUpdation";

	public static final String AGENT_BALANCE = "get_agent_balance";

	public static final String ADD_AMOUNT = "add_amount";

	public static final String MONEYGRAM_PARTNER = "MoneyGram_Partner";

	public static final String MONEYGRAM_API = "MoneyGram API";

	public static final String CARD_ACTIVE_ADDAMOUNT_UPDATE = "card_active_addamount_update";

	public static Map<String, String> MOBILE_COUNTRY_CODE = new HashMap<String, String>();

	static {
		MOBILE_COUNTRY_CODE.put("India", "+91");
		MOBILE_COUNTRY_CODE.put("US", "+1");
	}

	public static final String ACK_BY_CRM = "Customer acknowledge by CRM";

	public static final String ACK_BY_SALES_AGENT = "Sales Agent acknowledge by CRM";

	public static final String SHARED_WITH_CRM = "Shared with CRM";

	public static final String CRM_API = "CRM_API";

	public static final Integer CRM_DEFAULT_RECORDS = 1000;

	public static final Integer ONE = 1;

	public static final Integer FOUR = 4;

	public static final String CUSTOMER_INFO_UPDATION = "customerInfoUpdation";

	public static final String PARTNER_ACK_BY_CRM = "Partner acknowledge by CRM";

	public static final String CUSTOMER_ACCOUNT_ACK_BY_CRM = "Customer Account acknowledge by CRM";

	public static final String ACK_BY_AGENT_ACCOUNT = "Agent Account acknowledge by CRM";

	public static final String SSN = "SSN";

	// CI-744 - UTDOC - NUCC Debit Cards - Wrong API Date Format Coming From
	// Cashless
	public static final String LEGACY_DATE_FORMAT = "yyyyMMdd";

	public static final String ACQUER_FEE = "Acquirer Fee";
	public static final String LOAD_FEE = "Load Fee";
	public static final String NW_TXN_FEE = "Network transactions only";
	public static final String NON_NW_TXN_FEE = "Non-network transactions only";
	public static final String BOTH_FEES = "Both Network and non-network";

	public static final Integer DEFAULT_RANDOM = 4;

	public static final String BULK_LOAD_FTP = "BULK_LOAD_FTP_";

	public static final String BULK_DISBURSE_FTP = "BULK_DISBURSE_FTP_";

	public static final String DAILY_AGENT_LOAD_REPORT = "Daily agent load report";

	public static final String INCREASE = "Increase";

	public static final String DECREASE = "Decrease";

	public static final String CARRIER_ID_REGXP = "^\\d{1,10}$";

	public static final String OPTED_FOR_CARD = "card";

	public static final String OPTED_FOR_CHECK = "check";

	public static final String OPTED_FOR_ACH = "ach";

	public static final String AMOUNT_REGXP = "[^0-9.]";

	public static final String MOB_REGXP = "^\\d{10}$";

	public static final String MOB_NUM_ONLY = "[^0-9]";

	public static final String EMAIL_REGXP = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";

	public static final String ALL = "ALL";

	public static final String ONLY_LOADS = "ONLY_LOADS";

	public static final String ONLY_REVERSALS = "ONLY_REVERSALS";

	public static final String FEE_INCLUDED = "FEE_INCLUDED";

	public static final String FEE_ONLY = "FEE_ONLY";

	public static final String FEE_NOT_INCLUDED = "FEE_NOT_INCLUDED";

	public static final String DOB_DATE_SLASH_REGEX = "^(0?[1-9]|1?[012])[/]([0-2]?[0-9]?|0?[12]|3[01])[/](19|20)\\d\\d$";

	public static final String DOB_DATE_HYPHEN_REGEX = "^(0?[1-9]|1?[012])[-]([0-2]?[0-9]?|0?[12]|3[01])[-](19|20)\\d\\d$";

	public static final String DOB_FORMAT_REGEX = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";

	public static final String DOWNLOAD_EXCEL = "downloadXL";

	public static final String DOWNLOAD_CSV = "downloadCSV";

	public static final String DOWNLOAD_PDF = "downloadPDF";

	public static final String VIEW_ONLY = "viewOnly";

	public static final String MIME_XLS = "application/vnd.ms-excel";

	public static final String MIME_CSV = "text/csv";

	public static final String MIME_PDF = "application/pdf";

	public static final String IP_ADD_REGEX = "^([0-9]{1,3}\\.){3}[0-9]{1,3}(\\/([0-9]|[1-2][0-9]|3[0-2]))?$";

	public static final String FORWARD_SLASH = "/";

	public static final String DEFAULT_PREAUTH_CONFIG_MCC = "0000";

	public static final String REGEX_MOBILE = "^\\d{10,15}$";

	public static final int BEGIN_INDEX_FOUR = 4;

	public static final int BEGIN_INDEX_SIX = 6;

	public static final String DECLAIN_TXN = "Declined transaction";

	public static final String SUCCESS_TXN = "Successful transaction";

	public static final String FROM_MAIL = "Payment Gateway <noreply@terrapay.com>";

	public static final String PIN_TRIES_EXCEEDED = "PIN tries exceeded";

	public static final String INCORRECT_PIN = "Incorrect PIN";

}
