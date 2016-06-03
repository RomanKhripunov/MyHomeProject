package TimeTracker;

import java.util.Arrays;

public class Scoring {

    //riskLogger.info("RiskTools.checkScoring71" + " credit = " + creditRiskFilter.getCredit().getId() + "; offlinePartner="+creditRiskFilter.getCredit().getOfflinePartner());
    //try {
    //    OfflinePartner offlinePartner = creditRiskFilter.getCredit().getOfflinePartner();
//        Integer scoring71 = creditRiskFilter.getScoringResult71();
//        double amount = creditRiskFilter.getCredit().getInitialAmount().getAmount();
//        riskLogger.info("RiskTools.checkScoring71 credit = " + creditRiskFilter.getCredit().getId() + "; amount="+amount + "; isProd = " + PropertyTools.isProd());
//        if (offlinePartner == null || Arrays.asList(AffiliateMerchantType.MONEYMAN).contains(offlinePartner.getType())) {
//            int random = RandomUtils.nextInt(100) + 1;
//            if (scoring71 == null) {
//                riskFilterStatus.setStatusCancelled(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC001, creditRiskFilter);
//            }
//
//            else if (scoring71 < 400) {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.R399);
//                riskFilterStatus.setStatusCancelled(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC1251, creditRiskFilter);
//            }
//
//            else if (scoring71 >= 400 && scoring71 < 600) {
//                if ((!PropertyTools.isProd() && amount == 1500d) || (PropertyTools.isProd() && random <= 5)) {
//                    creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.R400);
//                    riskFilterStatus.setStatusCancelled(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC1253, creditRiskFilter);
//                } else {
//                    creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.CO_VER_NOIDV_400);
//                    if (amount > 5600d) {
//                        setScoringLimitCreditAmount(5600d, CreditStatusCause.SC1253, creditRiskFilter, riskFilterStatus);
//                    } else {
//                        riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1253);
//                    }
//                }
//            }
//
//            else if (scoring71 >= 600 && scoring71 < 650) {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.CO_VER_NOIDV_600);
//                if (amount > 5600d) {
//                    setScoringLimitCreditAmount(5600d, CreditStatusCause.SC1256, creditRiskFilter, riskFilterStatus);
//                } else {
//                    riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1256);
//                }
//            }
//
//            else if (scoring71 >= 650 && scoring71 < 880) {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.VER_NOIDV_650);
//                riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1257);
//            }
//
//            else if (scoring71 >= 880 && scoring71 < 977) {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.AA_IDV_880);
//                riskFilterStatus.addCreditStatusCause(CreditStatusCause.SC1261);
//            }
//
//            // scoring71 > 977
//            else {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.AA_NOIDV_977);
//                riskFilterStatus.addCreditStatusCause(CreditStatusCause.SC1262);
//            }
//
//
//
//        }
//    } finally {
//        if (creditRiskFilter.getScoring71Strategy() != null) {
//            creditRiskFilter.getCredit().addSystemNotes("Scoring 7.1 strategy = " + creditRiskFilter.getScoring71Strategy());
//        }
//    }
}
