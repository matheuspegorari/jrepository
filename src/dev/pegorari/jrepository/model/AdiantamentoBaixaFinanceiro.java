package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AdiantamentoBaixaFinanceiro implements SankhyaEntity<AdiantamentoBaixaFinanceiro> {

   private BigDecimal codUsu;
   private Timestamp dhMov;
   private BigDecimal nuAntecipa;
   private BigDecimal nuFin;
   private BigDecimal vlrTaxa;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhMov() {
        return dhMov;
   }

   public void setDhMov(Timestamp dhMov) {
        this.dhMov = dhMov;
   }

   public BigDecimal getNuAntecipa() {
        return nuAntecipa;
   }

   public void setNuAntecipa(BigDecimal nuAntecipa) {
        this.nuAntecipa = nuAntecipa;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getVlrTaxa() {
        return vlrTaxa;
   }

   public void setVlrTaxa(BigDecimal vlrTaxa) {
        this.vlrTaxa = vlrTaxa;
   }

   @Override
   public String getEntityName() {
        return "AdiantamentoBaixaFinanceiro";
   }

   @Override
   public AdiantamentoBaixaFinanceiro fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhMov = vo.asTimestamp("DHMOV");
        this.nuAntecipa = vo.asBigDecimal("NUANTECIPA");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.vlrTaxa = vo.asBigDecimal("VLRTAXA");
        return this;
   }
}
