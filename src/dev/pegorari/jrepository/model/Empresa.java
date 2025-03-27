package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Empresa extends AbstractSankhyaEntity<Empresa> {
   public BigDecimal getAtivecon() {
        return this.getVo().asBigDecimal("ATIVECON");
   }

   public void setAtivecon(BigDecimal ativecon) {
        markAsChanged("ATIVECON", ativecon);
   }

   public String getCargas() {
        return this.getVo().asString("CARGAS");
   }

   public void setCargas(String cargas) {
        markAsChanged("CARGAS", cargas);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public String getCgc() {
        return this.getVo().asString("CGC");
   }

   public void setCgc(String cgc) {
        markAsChanged("CGC", cgc);
   }

   public BigDecimal getCodbai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodbai(BigDecimal codbai) {
        markAsChanged("CODBAI", codbai);
   }

   public BigDecimal getCodcid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodcid(BigDecimal codcid) {
        markAsChanged("CODCID", codcid);
   }

   public String getCodcnl() {
        return this.getVo().asString("CODCNL");
   }

   public void setCodcnl(String codcnl) {
        markAsChanged("CODCNL", codcnl);
   }

   public BigDecimal getCodemp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodemp(BigDecimal codemp) {
        markAsChanged("CODEMP", codemp);
   }

   public BigDecimal getCodempmatriz() {
        return this.getVo().asBigDecimal("CODEMPMATRIZ");
   }

   public void setCodempmatriz(BigDecimal codempmatriz) {
        markAsChanged("CODEMPMATRIZ", codempmatriz);
   }

   public BigDecimal getCodend() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodend(BigDecimal codend) {
        markAsChanged("CODEND", codend);
   }

   public BigDecimal getCodmun() {
        return this.getVo().asBigDecimal("CODMUN");
   }

   public void setCodmun(BigDecimal codmun) {
        markAsChanged("CODMUN", codmun);
   }

   public BigDecimal getCodparc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodparc(BigDecimal codparc) {
        markAsChanged("CODPARC", codparc);
   }

   public BigDecimal getCodregtrib() {
        return this.getVo().asBigDecimal("CODREGTRIB");
   }

   public void setCodregtrib(BigDecimal codregtrib) {
        markAsChanged("CODREGTRIB", codregtrib);
   }

   public String getComissoes() {
        return this.getVo().asString("COMISSOES");
   }

   public void setComissoes(String comissoes) {
        markAsChanged("COMISSOES", comissoes);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public Timestamp getContabilidade() {
        return this.getVo().asTimestamp("CONTABILIDADE");
   }

   public void setContabilidade(Timestamp contabilidade) {
        markAsChanged("CONTABILIDADE", contabilidade);
   }

   public String getCooperativa() {
        return this.getVo().asString("COOPERATIVA");
   }

   public void setCooperativa(String cooperativa) {
        markAsChanged("COOPERATIVA", cooperativa);
   }

   public String getCpfresp() {
        return this.getVo().asString("CPFRESP");
   }

   public void setCpfresp(String cpfresp) {
        markAsChanged("CPFRESP", cpfresp);
   }

   public Timestamp getDtconvsoc() {
        return this.getVo().asTimestamp("DTCONVSOC");
   }

   public void setDtconvsoc(Timestamp dtconvsoc) {
        markAsChanged("DTCONVSOC", dtconvsoc);
   }

   public Timestamp getDtregjunta() {
        return this.getVo().asTimestamp("DTREGJUNTA");
   }

   public void setDtregjunta(Timestamp dtregjunta) {
        markAsChanged("DTREGJUNTA", dtregjunta);
   }

   public String getDupliv() {
        return this.getVo().asString("DUPLIV");
   }

   public void setDupliv(String dupliv) {
        markAsChanged("DUPLIV", dupliv);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public BigDecimal getEmpagrupargol() {
        return this.getVo().asBigDecimal("EMPAGRUPARGOL");
   }

   public void setEmpagrupargol(BigDecimal empagrupargol) {
        markAsChanged("EMPAGRUPARGOL", empagrupargol);
   }

   public String getEstoque() {
        return this.getVo().asString("ESTOQUE");
   }

   public void setEstoque(String estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public String getFax() {
        return this.getVo().asString("FAX");
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
   }

   public String getFinanceiro() {
        return this.getVo().asString("FINANCEIRO");
   }

   public void setFinanceiro(String financeiro) {
        markAsChanged("FINANCEIRO", financeiro);
   }

   public String getFolhapagto() {
        return this.getVo().asString("FOLHAPAGTO");
   }

   public void setFolhapagto(String folhapagto) {
        markAsChanged("FOLHAPAGTO", folhapagto);
   }

   public String getHomepage() {
        return this.getVo().asString("HOMEPAGE");
   }

   public void setHomepage(String homepage) {
        markAsChanged("HOMEPAGE", homepage);
   }

   public String getInscestad() {
        return this.getVo().asString("INSCESTAD");
   }

   public void setInscestad(String inscestad) {
        markAsChanged("INSCESTAD", inscestad);
   }

   public String getInscmun() {
        return this.getVo().asString("INSCMUN");
   }

   public void setInscmun(String inscmun) {
        markAsChanged("INSCMUN", inscmun);
   }

   public String getLatitude() {
        return this.getVo().asString("LATITUDE");
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
   }

   public BigDecimal getLimcurvaB() {
        return this.getVo().asBigDecimal("LIMCURVA_B");
   }

   public void setLimcurvaB(BigDecimal limcurvaB) {
        markAsChanged("LIMCURVA_B", limcurvaB);
   }

   public BigDecimal getLimcurvaC() {
        return this.getVo().asBigDecimal("LIMCURVA_C");
   }

   public void setLimcurvaC(BigDecimal limcurvaC) {
        markAsChanged("LIMCURVA_C", limcurvaC);
   }

   public String getLivrosfiscais() {
        return this.getVo().asString("LIVROSFISCAIS");
   }

   public void setLivrosfiscais(String livrosfiscais) {
        markAsChanged("LIVROSFISCAIS", livrosfiscais);
   }

   public byte[] getLogomarca() {
        return this.getVo().asBlob("LOGOMARCA");
   }

   public void setLogomarca(byte[] logomarca) {
        markAsChanged("LOGOMARCA", logomarca);
   }

   public String getLongitude() {
        return this.getVo().asString("LONGITUDE");
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
   }

   public String getModelonfdes() {
        return this.getVo().asString("MODELONFDES");
   }

   public void setModelonfdes(String modelonfdes) {
        markAsChanged("MODELONFDES", modelonfdes);
   }

   public BigDecimal getNatestab() {
        return this.getVo().asBigDecimal("NATESTAB");
   }

   public void setNatestab(BigDecimal natestab) {
        markAsChanged("NATESTAB", natestab);
   }

   public BigDecimal getNatjur() {
        return this.getVo().asBigDecimal("NATJUR");
   }

   public void setNatjur(BigDecimal natjur) {
        markAsChanged("NATJUR", natjur);
   }

   public String getNomefantasia() {
        return this.getVo().asString("NOMEFANTASIA");
   }

   public void setNomefantasia(String nomefantasia) {
        markAsChanged("NOMEFANTASIA", nomefantasia);
   }

   public String getNumend() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumend(String numend) {
        markAsChanged("NUMEND", numend);
   }

   public BigDecimal getNumpropr() {
        return this.getVo().asBigDecimal("NUMPROPR");
   }

   public void setNumpropr(BigDecimal numpropr) {
        markAsChanged("NUMPROPR", numpropr);
   }

   public String getPrinctitular() {
        return this.getVo().asString("PRINCTITULAR");
   }

   public void setPrinctitular(String princtitular) {
        markAsChanged("PRINCTITULAR", princtitular);
   }

   public String getProducao() {
        return this.getVo().asString("PRODUCAO");
   }

   public void setProducao(String producao) {
        markAsChanged("PRODUCAO", producao);
   }

   public String getRamoativ() {
        return this.getVo().asString("RAMOATIV");
   }

   public void setRamoativ(String ramoativ) {
        markAsChanged("RAMOATIV", ramoativ);
   }

   public String getRazaoabrev() {
        return this.getVo().asString("RAZAOABREV");
   }

   public void setRazaoabrev(String razaoabrev) {
        markAsChanged("RAZAOABREV", razaoabrev);
   }

   public String getRazaosocial() {
        return this.getVo().asString("RAZAOSOCIAL");
   }

   public void setRazaosocial(String razaosocial) {
        markAsChanged("RAZAOSOCIAL", razaosocial);
   }

   public String getRegjuntacom() {
        return this.getVo().asString("REGJUNTACOM");
   }

   public void setRegjuntacom(String regjuntacom) {
        markAsChanged("REGJUNTACOM", regjuntacom);
   }

   public String getSerienfdes() {
        return this.getVo().asString("SERIENFDES");
   }

   public void setSerienfdes(String serienfdes) {
        markAsChanged("SERIENFDES", serienfdes);
   }

   public String getSimples() {
        return this.getVo().asString("SIMPLES");
   }

   public void setSimples(String simples) {
        markAsChanged("SIMPLES", simples);
   }

   public String getSimplesnacnauf() {
        return this.getVo().asString("SIMPLESNACNAUF");
   }

   public void setSimplesnacnauf(String simplesnacnauf) {
        markAsChanged("SIMPLESNACNAUF", simplesnacnauf);
   }

   public String getSupdecisao() {
        return this.getVo().asString("SUPDECISAO");
   }

   public void setSupdecisao(String supdecisao) {
        markAsChanged("SUPDECISAO", supdecisao);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public String getTelex() {
        return this.getVo().asString("TELEX");
   }

   public void setTelex(String telex) {
        markAsChanged("TELEX", telex);
   }

   public String getTiporegra() {
        return this.getVo().asString("TIPOREGRA");
   }

   public void setTiporegra(String tiporegra) {
        markAsChanged("TIPOREGRA", tiporegra);
   }

   public BigDecimal getTiposn() {
        return this.getVo().asBigDecimal("TIPOSN");
   }

   public void setTiposn(BigDecimal tiposn) {
        markAsChanged("TIPOSN", tiposn);
   }

   public BigDecimal getCorempresa() {
        return this.getVo().asBigDecimal("COREMPRESA");
   }

   public void setCorempresa(BigDecimal corempresa) {
        markAsChanged("COREMPRESA", corempresa);
   }

   public String getRazaosocialcompleta() {
        return this.getVo().asString("RAZAOSOCIALCOMPLETA");
   }

   public void setRazaosocialcompleta(String razaosocialcompleta) {
        markAsChanged("RAZAOSOCIALCOMPLETA", razaosocialcompleta);
   }

   public BigDecimal getQtdacessos() {
        return this.getVo().asBigDecimal("QTDACESSOS");
   }

   public void setQtdacessos(BigDecimal qtdacessos) {
        markAsChanged("QTDACESSOS", qtdacessos);
   }

   public String getRntrc() {
        return this.getVo().asString("RNTRC");
   }

   public void setRntrc(String rntrc) {
        markAsChanged("RNTRC", rntrc);
   }

   public String getUsarazaosocial() {
        return this.getVo().asString("USARAZAOSOCIAL");
   }

   public void setUsarazaosocial(String usarazaosocial) {
        markAsChanged("USARAZAOSOCIAL", usarazaosocial);
   }

   public String getProdutorrural() {
        return this.getVo().asString("PRODUTORRURAL");
   }

   public void setProdutorrural(String produtorrural) {
        markAsChanged("PRODUTORRURAL", produtorrural);
   }

   public String getEmpidenotas() {
        return this.getVo().asString("EMPIDENOTAS");
   }

   public void setEmpidenotas(String empidenotas) {
        markAsChanged("EMPIDENOTAS", empidenotas);
   }

   public Timestamp getDhconsitimend() {
        return this.getVo().asTimestamp("DHCONSITIMEND");
   }

   public void setDhconsitimend(Timestamp dhconsitimend) {
        markAsChanged("DHCONSITIMEND", dhconsitimend);
   }

   public String getNumtaf() {
        return this.getVo().asString("NUMTAF");
   }

   public void setNumtaf(String numtaf) {
        markAsChanged("NUMTAF", numtaf);
   }

   public String getNurest() {
        return this.getVo().asString("NUREST");
   }

   public void setNurest(String nurest) {
        markAsChanged("NUREST", nurest);
   }

   public BigDecimal getAcdintisenmulta() {
        return this.getVo().asBigDecimal("ACDINTISENMULTA");
   }

   public void setAcdintisenmulta(BigDecimal acdintisenmulta) {
        markAsChanged("ACDINTISENMULTA", acdintisenmulta);
   }

   public BigDecimal getClasstrib() {
        return this.getVo().asBigDecimal("CLASSTRIB");
   }

   public void setClasstrib(BigDecimal classtrib) {
        markAsChanged("CLASSTRIB", classtrib);
   }

   public BigDecimal getIndconstr() {
        return this.getVo().asBigDecimal("INDCONSTR");
   }

   public void setIndconstr(BigDecimal indconstr) {
        markAsChanged("INDCONSTR", indconstr);
   }

   public BigDecimal getIndcoop() {
        return this.getVo().asBigDecimal("INDCOOP");
   }

   public void setIndcoop(BigDecimal indcoop) {
        markAsChanged("INDCOOP", indcoop);
   }

   public BigDecimal getIndopccp() {
        return this.getVo().asBigDecimal("INDOPCCP");
   }

   public void setIndopccp(BigDecimal indopccp) {
        markAsChanged("INDOPCCP", indopccp);
   }

   public BigDecimal getIndsitesp() {
        return this.getVo().asBigDecimal("INDSITESP");
   }

   public void setIndsitesp(BigDecimal indsitesp) {
        markAsChanged("INDSITESP", indsitesp);
   }

   public BigDecimal getInfoobra() {
        return this.getVo().asBigDecimal("INFOOBRA");
   }

   public void setInfoobra(BigDecimal infoobra) {
        markAsChanged("INFOOBRA", infoobra);
   }

   public String getCotm() {
        return this.getVo().asString("COTM");
   }

   public void setCotm(String cotm) {
        markAsChanged("COTM", cotm);
   }

   public BigDecimal getCnaeprepon() {
        return this.getVo().asBigDecimal("CNAEPREPON");
   }

   public void setCnaeprepon(BigDecimal cnaeprepon) {
        markAsChanged("CNAEPREPON", cnaeprepon);
   }

   public String getCnpjprefeitura() {
        return this.getVo().asString("CNPJPREFEITURA");
   }

   public void setCnpjprefeitura(String cnpjprefeitura) {
        markAsChanged("CNPJPREFEITURA", cnpjprefeitura);
   }

   @Override
   public String getTableName() {
        return "TSIEMP";
   }

   @Override
   public String getEntityName() {
        return "Empresa";
   }

   @Override
   public Empresa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
