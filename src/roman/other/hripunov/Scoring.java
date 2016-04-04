package roman.other.hripunov;

import java.util.Random;

public class Scoring {
    public static void main(String[] args) {
        Random rand = new Random(100);
        int random = rand.nextInt(1);
//
//
//        if (scoring71 < 400) {
//            creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.R399);
//            riskFilterStatus.setStatusCancelled(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC1252, creditRiskFilter);
//        } else if (
//        scoring71 >= 400 && scoring71 < 600
//                ) {
//            if ((!PropertyTools.isProd() && amount == 1500d) || (PropertyTools.isProd() && random <= 5)) {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.R400);
//                riskFilterStatus.setStatusCancelled(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC1254, creditRiskFilter);
//            } else {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.CO_VER_NOIDV_400);
//                if (amount > 5600d) {
//                    setScoringLimitCreditAmount(5600d, CreditStatusCause.SC1254, creditRiskFilter, riskFilterStatus);
//                } else {
//                    riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1254);
//                }
//            }
//        } else if (
//                scoring71 >= 600 && scoring71 < 650
//                ) {
//            if ((!PropertyTools.isProd() && amount != 1500d) || (PropertyTools.isProd() &&
//                    random <= 50
//            )) {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.CO_VER_NOIDV_600);
//                if (amount > 5600d) {
//                    setScoringLimitCreditAmount(5600d, CreditStatusCause.SC1256, creditRiskFilter, riskFilterStatus);
//                } else {
//                    riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1256);
//                }
//            } else {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.CO_VER_IDV_600);
//                if (amount > 5600d) {
//                    setScoringLimitCreditAmount(5600d, CreditStatusCause.SC1256, creditRiskFilter, riskFilterStatus);
//                }  else {
//                    riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1256);
//                }
//            }
//
//
//
//
//        } else if (scoring71 >= 650 && scoring71 < 880) {
//            if ((!PropertyTools.isProd() && amount != 1500d) || (PropertyTools.isProd() && random <= 50)) {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.VER_NOIDV_650);
//                riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1258);
//            } else {
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.VER_IDV_650);
//                riskFilterStatus.setStatusPending(CreditStatusReasonCode.PENDING_RISK_SCORING, CreditStatusCause.SC1258);
//            }
//
//
//
//        } else {
//            if ((!PropertyTools.isProd() && amount == 1500d) || (PropertyTools.isProd() &&
//                    random <= 10
//            )) {
//                riskFilterStatus.addCreditStatusCause(CreditStatusCause.SC1260);
//                //riskFilterStatus.setStatusPending(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC1260);
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.AA_IDV_MAcodes_946);
//            } else if ((!PropertyTools.isProd() && amount == 2000d) || (PropertyTools.isProd() &&
//                    random <= 80
//            )) {
//                riskFilterStatus.addCreditStatusCause(CreditStatusCause.SC1260);
//                //riskFilterStatus.setStatusPending(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC1260);
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.AA_NOIDV_946);
//            } else {
//                riskFilterStatus.addCreditStatusCause(CreditStatusCause.SC1260);
//                //riskFilterStatus.setStatusPending(CreditStatusReasonCode.CANCELLED_RISK_SCORING, CreditStatusCause.SC1260);
//                creditRiskFilter.setScoring71Strategy(CreditRiskFilterScoring71Strategy.AA_IDV_946);
//            }
//        }
    }
}
