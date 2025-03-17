package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoDeclaracaoExportacao implements SankhyaEntity<InformacaoDeclaracaoExportacao> {

   private BigDecimal codPaisDestino;
   private Timestamp dtaVerbacacao;
   private Timestamp dtDeclaracao;
   private String natureza;
   private String nroDeclaracao;
   private BigDecimal tipoDec;

   public BigDecimal getCodPaisDestino() {
        return codPaisDestino;
   }

   public void setCodPaisDestino(BigDecimal codPaisDestino) {
        this.codPaisDestino = codPaisDestino;
   }

   public Timestamp getDtaVerbacacao() {
        return dtaVerbacacao;
   }

   public void setDtaVerbacacao(Timestamp dtaVerbacacao) {
        this.dtaVerbacacao = dtaVerbacacao;
   }

   public Timestamp getDtDeclaracao() {
        return dtDeclaracao;
   }

   public void setDtDeclaracao(Timestamp dtDeclaracao) {
        this.dtDeclaracao = dtDeclaracao;
   }

   public String getNatureza() {
        return natureza;
   }

   public void setNatureza(String natureza) {
        this.natureza = natureza;
   }

   public String getNroDeclaracao() {
        return nroDeclaracao;
   }

   public void setNroDeclaracao(String nroDeclaracao) {
        this.nroDeclaracao = nroDeclaracao;
   }

   public BigDecimal getTipoDec() {
        return tipoDec;
   }

   public void setTipoDec(BigDecimal tipoDec) {
        this.tipoDec = tipoDec;
   }

   @Override
   public String getEntityName() {
        return "InformacaoDeclaracaoExportacao";
   }

   @Override
   public InformacaoDeclaracaoExportacao fromVO(DynamicVO vo) {
        this.codPaisDestino = vo.asBigDecimal("CODPAISDESTINO");
        this.dtaVerbacacao = vo.asTimestamp("DTAVERBACACAO");
        this.dtDeclaracao = vo.asTimestamp("DTDECLARACAO");
        this.natureza = vo.asString("NATUREZA");
        this.nroDeclaracao = vo.asString("NRODECLARACAO");
        this.tipoDec = vo.asBigDecimal("TIPODEC");
        return this;
   }
}
