package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AnuncioVagas extends AbstractSankhyaEntity<AnuncioVagas> {
   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getResumo() {
        return this.getVo().asString("RESUMO");
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
   }

   public String getDescrVaga() {
        return this.getVo().asString("DESCRVAGA");
   }

   public void setDescrVaga(String descrVaga) {
        markAsChanged("DESCRVAGA", descrVaga);
   }

   public BigDecimal getCodAnuncio() {
        return this.getVo().asBigDecimal("CODANUNCIO");
   }

   public void setCodAnuncio(BigDecimal codAnuncio) {
        markAsChanged("CODANUNCIO", codAnuncio);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getFaixaSalarialFinal() {
        return this.getVo().asBigDecimal("FAIXASALARIALFINAL");
   }

   public void setFaixaSalarialFinal(BigDecimal faixaSalarialFinal) {
        markAsChanged("FAIXASALARIALFINAL", faixaSalarialFinal);
   }

   public Timestamp getDtEntrada() {
        return this.getVo().asTimestamp("DTENTRADA");
   }

   public void setDtEntrada(Timestamp dtEntrada) {
        markAsChanged("DTENTRADA", dtEntrada);
   }

   public BigDecimal getFaixaSalarialInicial() {
        return this.getVo().asBigDecimal("FAIXASALARIALINICIAL");
   }

   public void setFaixaSalarialInicial(BigDecimal faixaSalarialInicial) {
        markAsChanged("FAIXASALARIALINICIAL", faixaSalarialInicial);
   }

   public BigDecimal getGrauInstr() {
        return this.getVo().asBigDecimal("GRAUINSTR");
   }

   public void setGrauInstr(BigDecimal grauInstr) {
        markAsChanged("GRAUINSTR", grauInstr);
   }

   public BigDecimal getNuVagas() {
        return this.getVo().asBigDecimal("NUVAGAS");
   }

   public void setNuVagas(BigDecimal nuVagas) {
        markAsChanged("NUVAGAS", nuVagas);
   }

   public Timestamp getDtTermino() {
        return this.getVo().asTimestamp("DTTERMINO");
   }

   public void setDtTermino(Timestamp dtTermino) {
        markAsChanged("DTTERMINO", dtTermino);
   }

   @Override
   public String getTableName() {
        return "TRSANU";
   }

   @Override
   public String getEntityName() {
        return "AnuncioVagas";
   }

   @Override
   public AnuncioVagas fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
