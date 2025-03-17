package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoTabelaIrpfInss implements SankhyaEntity<CabecalhoTabelaIrpfInss> {

   private Timestamp competencia;
   private String regime;
   private BigDecimal vlrDependente;
   private BigDecimal vlrMaximo;
   private BigDecimal vlrMinimo;
   private BigDecimal vlrMinimoIrpf;
   private String usaCalcInssProg;
   private String usaParcInssFunRural;
   private String consDescSimpIrpf;

   public Timestamp getCompetencia() {
        return competencia;
   }

   public void setCompetencia(Timestamp competencia) {
        this.competencia = competencia;
   }

   public String getRegime() {
        return regime;
   }

   public void setRegime(String regime) {
        this.regime = regime;
   }

   public BigDecimal getVlrDependente() {
        return vlrDependente;
   }

   public void setVlrDependente(BigDecimal vlrDependente) {
        this.vlrDependente = vlrDependente;
   }

   public BigDecimal getVlrMaximo() {
        return vlrMaximo;
   }

   public void setVlrMaximo(BigDecimal vlrMaximo) {
        this.vlrMaximo = vlrMaximo;
   }

   public BigDecimal getVlrMinimo() {
        return vlrMinimo;
   }

   public void setVlrMinimo(BigDecimal vlrMinimo) {
        this.vlrMinimo = vlrMinimo;
   }

   public BigDecimal getVlrMinimoIrpf() {
        return vlrMinimoIrpf;
   }

   public void setVlrMinimoIrpf(BigDecimal vlrMinimoIrpf) {
        this.vlrMinimoIrpf = vlrMinimoIrpf;
   }

   public String getUsaCalcInssProg() {
        return usaCalcInssProg;
   }

   public void setUsaCalcInssProg(String usaCalcInssProg) {
        this.usaCalcInssProg = usaCalcInssProg;
   }

   public String getUsaParcInssFunRural() {
        return usaParcInssFunRural;
   }

   public void setUsaParcInssFunRural(String usaParcInssFunRural) {
        this.usaParcInssFunRural = usaParcInssFunRural;
   }

   public String getConsDescSimpIrpf() {
        return consDescSimpIrpf;
   }

   public void setConsDescSimpIrpf(String consDescSimpIrpf) {
        this.consDescSimpIrpf = consDescSimpIrpf;
   }

   @Override
   public String getEntityName() {
        return "CabecalhoTabelaIrpfInss";
   }

   @Override
   public CabecalhoTabelaIrpfInss fromVO(DynamicVO vo) {
        this.competencia = vo.asTimestamp("COMPETENCIA");
        this.regime = vo.asString("REGIME");
        this.vlrDependente = vo.asBigDecimal("VLRDEPENDENTE");
        this.vlrMaximo = vo.asBigDecimal("VLRMAXIMO");
        this.vlrMinimo = vo.asBigDecimal("VLRMINIMO");
        this.vlrMinimoIrpf = vo.asBigDecimal("VLRMINIMOIRPF");
        this.usaCalcInssProg = vo.asString("USACALCINSSPROG");
        this.usaParcInssFunRural = vo.asString("USAPARCINSSFUNRURAL");
        this.consDescSimpIrpf = vo.asString("CONSDESCSIMPIRPF");
        return this;
   }
}
