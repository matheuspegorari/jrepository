package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpenhoProduto extends AbstractSankhyaEntity<EmpenhoProduto> {
   private String chaveNfe;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private String codVol;
   private String controle;
   private String descrSituacao;
   private Timestamp dtAlter;
   private BigDecimal nuNota;
   private BigDecimal nuNotaPedVen;
   private BigDecimal nuRecebimento;
   private String pendente;
   private BigDecimal qtdEmpenho;
   private String tipo;

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
        this.chaveNfe = chaveNfe;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getDescrSituacao() {
        return descrSituacao;
   }

   public void setDescrSituacao(String descrSituacao) {
        markAsChanged("DESCRSITUACAO", descrSituacao);
        this.descrSituacao = descrSituacao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaPedVen() {
        return nuNotaPedVen;
   }

   public void setNuNotaPedVen(BigDecimal nuNotaPedVen) {
        markAsChanged("NUNOTAPEDVEN", nuNotaPedVen);
        this.nuNotaPedVen = nuNotaPedVen;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public String getPendente() {
        return pendente;
   }

   public void setPendente(String pendente) {
        markAsChanged("PENDENTE", pendente);
        this.pendente = pendente;
   }

   public BigDecimal getQtdEmpenho() {
        return qtdEmpenho;
   }

   public void setQtdEmpenho(BigDecimal qtdEmpenho) {
        markAsChanged("QTDEMPENHO", qtdEmpenho);
        this.qtdEmpenho = qtdEmpenho;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TGWEMPE";
   }

   @Override
   public String getEntityName() {
        return "EmpenhoProduto";
   }

   @Override
   public EmpenhoProduto fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.chaveNfe = vo.asString("CHAVENFE");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.descrSituacao = vo.asString("DESCRSITUACAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaPedVen = vo.asBigDecimal("NUNOTAPEDVEN");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.pendente = vo.asString("PENDENTE");
        this.qtdEmpenho = vo.asBigDecimal("QTDEMPENHO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
