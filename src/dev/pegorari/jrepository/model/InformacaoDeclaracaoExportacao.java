package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoDeclaracaoExportacao extends AbstractSankhyaEntity<InformacaoDeclaracaoExportacao> {
   private BigDecimal codPaisDestino;
   private Timestamp dtaVerbacao;
   private Timestamp dtDeclaracao;
   private String natureza;
   private String nroDeclaracao;
   private BigDecimal tipoDec;

   public BigDecimal getCodPaisDestino() {
        return codPaisDestino;
   }

   public void setCodPaisDestino(BigDecimal codPaisDestino) {
        markAsChanged("CODPAISDESTINO", codPaisDestino);
        this.codPaisDestino = codPaisDestino;
   }

   public Timestamp getDtaVerbacao() {
        return dtaVerbacao;
   }

   public void setDtaVerbacao(Timestamp dtaVerbacao) {
        markAsChanged("DTAVERBACAO", dtaVerbacao);
        this.dtaVerbacao = dtaVerbacao;
   }

   public Timestamp getDtDeclaracao() {
        return dtDeclaracao;
   }

   public void setDtDeclaracao(Timestamp dtDeclaracao) {
        markAsChanged("DTDECLARACAO", dtDeclaracao);
        this.dtDeclaracao = dtDeclaracao;
   }

   public String getNatureza() {
        return natureza;
   }

   public void setNatureza(String natureza) {
        markAsChanged("NATUREZA", natureza);
        this.natureza = natureza;
   }

   public String getNroDeclaracao() {
        return nroDeclaracao;
   }

   public void setNroDeclaracao(String nroDeclaracao) {
        markAsChanged("NRODECLARACAO", nroDeclaracao);
        this.nroDeclaracao = nroDeclaracao;
   }

   public BigDecimal getTipoDec() {
        return tipoDec;
   }

   public void setTipoDec(BigDecimal tipoDec) {
        markAsChanged("TIPODEC", tipoDec);
        this.tipoDec = tipoDec;
   }

   @Override
   public String getTableName() {
        return "TGFEXPD";
   }

   @Override
   public String getEntityName() {
        return "InformacaoDeclaracaoExportacao";
   }

   @Override
   public InformacaoDeclaracaoExportacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codPaisDestino = vo.asBigDecimal("CODPAISDESTINO");
        this.dtaVerbacao = vo.asTimestamp("DTAVERBACAO");
        this.dtDeclaracao = vo.asTimestamp("DTDECLARACAO");
        this.natureza = vo.asString("NATUREZA");
        this.nroDeclaracao = vo.asString("NRODECLARACAO");
        this.tipoDec = vo.asBigDecimal("TIPODEC");
        return this;
   }
}
