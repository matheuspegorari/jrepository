package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MultiplasDatasEntrega extends AbstractSankhyaEntity<MultiplasDatasEntrega> {
   private BigDecimal sequencia;
   private BigDecimal codProd;
   private BigDecimal qtdEntrega;
   private String controle;
   private String cabecalho;
   private Timestamp dataEntrega;
   private BigDecimal codLocal;
   private BigDecimal codParc;
   private BigDecimal diferenciador;
   private BigDecimal numCotacao;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getQtdEntrega() {
        return qtdEntrega;
   }

   public void setQtdEntrega(BigDecimal qtdEntrega) {
        markAsChanged("QTDENTREGA", qtdEntrega);
        this.qtdEntrega = qtdEntrega;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getCabecalho() {
        return cabecalho;
   }

   public void setCabecalho(String cabecalho) {
        markAsChanged("CABECALHO", cabecalho);
        this.cabecalho = cabecalho;
   }

   public Timestamp getDataEntrega() {
        return dataEntrega;
   }

   public void setDataEntrega(Timestamp dataEntrega) {
        markAsChanged("DATAENTREGA", dataEntrega);
        this.dataEntrega = dataEntrega;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getDiferenciador() {
        return diferenciador;
   }

   public void setDiferenciador(BigDecimal diferenciador) {
        markAsChanged("DIFERENCIADOR", diferenciador);
        this.diferenciador = diferenciador;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
        this.numCotacao = numCotacao;
   }

   @Override
   public String getTableName() {
        return "TGFMDE";
   }

   @Override
   public String getEntityName() {
        return "MultiplasDatasEntrega";
   }

   @Override
   public MultiplasDatasEntrega fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.qtdEntrega = vo.asBigDecimal("QTDENTREGA");
        this.controle = vo.asString("CONTROLE");
        this.cabecalho = vo.asString("CABECALHO");
        this.dataEntrega = vo.asTimestamp("DATAENTREGA");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.diferenciador = vo.asBigDecimal("DIFERENCIADOR");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        return this;
   }
}
