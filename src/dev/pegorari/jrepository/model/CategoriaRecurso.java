package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CategoriaRecurso implements SankhyaEntity<CategoriaRecurso> {

   private String analitico;
   private String ativo;
   private BigDecimal codCre;
   private BigDecimal codCrePai;
   private BigDecimal codServAponta;
   private BigDecimal grau;
   private String nome;
   private String paramSetup;
   private String tipo;
   private String tipoApontaUso;
   private String codVol;
   private BigDecimal decQtd;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        this.codCre = codCre;
   }

   public BigDecimal getCodCrePai() {
        return codCrePai;
   }

   public void setCodCrePai(BigDecimal codCrePai) {
        this.codCrePai = codCrePai;
   }

   public BigDecimal getCodServAponta() {
        return codServAponta;
   }

   public void setCodServAponta(BigDecimal codServAponta) {
        this.codServAponta = codServAponta;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public String getParamSetup() {
        return paramSetup;
   }

   public void setParamSetup(String paramSetup) {
        this.paramSetup = paramSetup;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getTipoApontaUso() {
        return tipoApontaUso;
   }

   public void setTipoApontaUso(String tipoApontaUso) {
        this.tipoApontaUso = tipoApontaUso;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getDecQtd() {
        return decQtd;
   }

   public void setDecQtd(BigDecimal decQtd) {
        this.decQtd = decQtd;
   }

   @Override
   public String getEntityName() {
        return "CategoriaRecurso";
   }

   @Override
   public CategoriaRecurso fromVO(DynamicVO vo) {
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codCrePai = vo.asBigDecimal("CODCREPAI");
        this.codServAponta = vo.asBigDecimal("CODSERVAPONTA");
        this.grau = vo.asBigDecimal("GRAU");
        this.nome = vo.asString("NOME");
        this.paramSetup = vo.asString("PARAMSETUP");
        this.tipo = vo.asString("TIPO");
        this.tipoApontaUso = vo.asString("TIPOAPONTAUSO");
        this.codVol = vo.asString("CODVOL");
        this.decQtd = vo.asBigDecimal("DECQTD");
        return this;
   }
}
