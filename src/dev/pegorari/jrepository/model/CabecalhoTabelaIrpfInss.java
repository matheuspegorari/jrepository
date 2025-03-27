package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoTabelaIrpfInss extends AbstractSankhyaEntity<CabecalhoTabelaIrpfInss> {
   public Timestamp getCompetencia() {
        return this.getVo().asTimestamp("COMPETENCIA");
   }

   public void setCompetencia(Timestamp competencia) {
        markAsChanged("COMPETENCIA", competencia);
   }

   public String getRegime() {
        return this.getVo().asString("REGIME");
   }

   public void setRegime(String regime) {
        markAsChanged("REGIME", regime);
   }

   public BigDecimal getVlrDependente() {
        return this.getVo().asBigDecimal("VLRDEPENDENTE");
   }

   public void setVlrDependente(BigDecimal vlrDependente) {
        markAsChanged("VLRDEPENDENTE", vlrDependente);
   }

   public BigDecimal getVlrMaximo() {
        return this.getVo().asBigDecimal("VLRMAXIMO");
   }

   public void setVlrMaximo(BigDecimal vlrMaximo) {
        markAsChanged("VLRMAXIMO", vlrMaximo);
   }

   public BigDecimal getVlrMinimo() {
        return this.getVo().asBigDecimal("VLRMINIMO");
   }

   public void setVlrMinimo(BigDecimal vlrMinimo) {
        markAsChanged("VLRMINIMO", vlrMinimo);
   }

   public BigDecimal getVlrMinimoIrpf() {
        return this.getVo().asBigDecimal("VLRMINIMOIRPF");
   }

   public void setVlrMinimoIrpf(BigDecimal vlrMinimoIrpf) {
        markAsChanged("VLRMINIMOIRPF", vlrMinimoIrpf);
   }

   public String getUsaCalcInssProg() {
        return this.getVo().asString("USACALCINSSPROG");
   }

   public void setUsaCalcInssProg(String usaCalcInssProg) {
        markAsChanged("USACALCINSSPROG", usaCalcInssProg);
   }

   public String getUsaParcInssFunRural() {
        return this.getVo().asString("USAPARCINSSFUNRURAL");
   }

   public void setUsaParcInssFunRural(String usaParcInssFunRural) {
        markAsChanged("USAPARCINSSFUNRURAL", usaParcInssFunRural);
   }

   public String getConsDescSimpIrpf() {
        return this.getVo().asString("CONSDESCSIMPIRPF");
   }

   public void setConsDescSimpIrpf(String consDescSimpIrpf) {
        markAsChanged("CONSDESCSIMPIRPF", consDescSimpIrpf);
   }

   @Override
   public String getTableName() {
        return "TGFPFX";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoTabelaIrpfInss";
   }

   @Override
   public CabecalhoTabelaIrpfInss fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
