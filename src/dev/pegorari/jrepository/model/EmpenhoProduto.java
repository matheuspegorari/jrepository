package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpenhoProduto implements SankhyaEntity<EmpenhoProduto> {

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
        this.chaveNfe = chaveNfe;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public String getDescrSituacao() {
        return descrSituacao;
   }

   public void setDescrSituacao(String descrSituacao) {
        this.descrSituacao = descrSituacao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaPedVen() {
        return nuNotaPedVen;
   }

   public void setNuNotaPedVen(BigDecimal nuNotaPedVen) {
        this.nuNotaPedVen = nuNotaPedVen;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        this.nuRecebimento = nuRecebimento;
   }

   public String getPendente() {
        return pendente;
   }

   public void setPendente(String pendente) {
        this.pendente = pendente;
   }

   public BigDecimal getQtdEmpenho() {
        return qtdEmpenho;
   }

   public void setQtdEmpenho(BigDecimal qtdEmpenho) {
        this.qtdEmpenho = qtdEmpenho;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "EmpenhoProduto";
   }

   @Override
   public EmpenhoProduto fromVO(DynamicVO vo) {
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
